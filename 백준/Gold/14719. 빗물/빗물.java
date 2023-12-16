import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] temp = br.readLine().split(" ");
        String[] h = br.readLine().split(" ");
        int[] heights = new int[Integer.parseInt(temp[1])];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = Integer.parseInt(h[i]);
        }

        int left = 0;
        int right = heights.length - 1;
        int leftMax = heights[left];
        int rightMax = heights[right];
        int volume = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, heights[left]);
            rightMax = Math.max(rightMax, heights[right]);

            if (leftMax < rightMax) {
                volume += leftMax - heights[left];
                left++;
            } else {
                volume += rightMax - heights[right];
                right--;
            }
        }

        bw.write(Integer.toString(volume));
        br.close();
        bw.flush();
        bw.close();

    }
}
