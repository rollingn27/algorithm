import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int[] P = new int[N];
            String[] p = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                P[i] = Integer.parseInt(p[i]);
            }

            Arrays.sort(P);
            int[] dp = new int[N + 1];
            dp[0] = 0;
            dp[1] = P[0];

            for (int i = 2; i <= N; i++) {
                dp[i] = dp[i - 1] + P[i - 1];
            }

            int shotTime = 0;
            for (int i = 1; i <= N; i++) {
                shotTime += dp[i];
            }
            bw.write(Integer.toString(shotTime));
        }
    }
}