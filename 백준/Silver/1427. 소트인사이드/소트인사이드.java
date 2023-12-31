import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String N = br.readLine();
            int[] nums = new int[N.length()];
            for (int i = 0; i < N.length(); i++) {
                nums[i] = N.charAt(i) - '0';
            }
            for (int i = 0; i < N.length() - 1; i++) {
                int max = i;
                for (int j = i + 1; j < N.length(); j++) {
                    if (nums[max] < nums[j]) {
                        max = j;
                    }
                }
                if (nums[max] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[max];
                    nums[max] = temp;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int n: nums) {
                sb.append(n);
            }
            bw.write(sb.toString());

        }
    }
}
