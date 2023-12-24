import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                int k = Integer.parseInt(br.readLine());
                int n = Integer.parseInt(br.readLine());
                int[][] dp = new int[k + 1][n + 1];
                for (int j = 0; j <= n; j++) {
                    dp[0][j] = j;
                }

                for (int ki = 1; ki <= k; ki++) {
                    for (int l = 1; l <= n; l++) {
                        dp[ki][l] = dp[ki - 1][l] + dp[ki][l - 1];
                    }
                }

                bw.write(Integer.toString(dp[k][n]) + "\n");

            }
        }

    }
}
