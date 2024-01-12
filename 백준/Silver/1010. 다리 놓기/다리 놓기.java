import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                String[] NM = br.readLine().split(" ");
                long M = Integer.parseInt(NM[0]);
                long N = Integer.parseInt(NM[1]);
                long r = N - M;
                long result = 1;
                if (r > M) {
                    for (int j = 0; j < M; j++) {
                        result *= N;
                        N--;
                    }
                    for (int j = 1; j <= M; j++) {
                        result /= j;
                    }
                } else {
                    for (int j = 0; j < r; j++) {
                        result *= N;
                        N--;
                    }
                    for (int j = 1; j <= r; j++) {
                        result /= j;
                    }
                }
                bw.write(Long.toString(result) + "\n");
            }
        }
    }
}
