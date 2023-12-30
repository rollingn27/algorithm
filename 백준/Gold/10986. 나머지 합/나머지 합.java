import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NM = br.readLine().split(" ");
            int n = Integer.parseInt(NM[0]);
            int m = Integer.parseInt(NM[1]);
            long[] sums = new long[n + 1];
            String[] nums = br.readLine().split(" ");
            long result = 0;
            if (n <= 1) {
                result = Long.parseLong(nums[0]) % m == 0 ? 1 : 0;
            } else {
                for (int i = 1; i <= n; i++) {
                    sums[i] = sums[i - 1] + Long.parseLong(nums[i - 1]);
                }
                int[] remainder = new int[m];
                for (int i = 1; i <= n; i++) {
                    int remain = (int) (sums[i] % m);
                    if (remain == 0) {
                        result++;
                    }
                    remainder[remain]++;
                }
                for (int i = 0; i < m; i++) {
                    if (remainder[i] > 1) {
                        result += (long) remainder[i] * (remainder[i] - 1) / 2;
                    }
                }
            }
            bw.write(String.valueOf(result));
        }
    }
}