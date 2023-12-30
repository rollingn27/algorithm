import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = Integer.parseInt(str[i]);
            }
            Arrays.sort(nums);
            int left = 0;
            int right = N - 1;
            int count = 0;
            while (left < right) {
                if (nums[left] + nums[right] == M) {
                    count++;
                    left++;
                    right--;
                } else if (nums[left] + nums[right] < M) {
                    left++;
                } else {
                    right--;
                }
            }
            bw.write(String.valueOf(count));
        }
    }
}