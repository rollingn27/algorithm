import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                int N = Integer.parseInt(br.readLine());
                if (N == 0) {
                    bw.write("1 0\n");
                    continue;
                }

                if (N == 1) {
                    bw.write("0 1\n");
                    continue;
                }
                int[] dp0 = new int[N + 1];
                dp0[0] = 1;
                dp0[1] = 0;

                int[] dp1 = new int[N + 1];
                dp1[0] = 0;
                dp1[1] = 1;

                for (int j = 2; j <= N; j++) {

                    dp0[j] = dp0[j - 1] + dp0[j - 2];
                    dp1[j] = dp1[j - 1] + dp1[j - 2];
                }

                bw.write(Integer.toString(dp0[N]) + " " + Integer.toString(dp1[N]) + "\n");

            }
        }
    }

}