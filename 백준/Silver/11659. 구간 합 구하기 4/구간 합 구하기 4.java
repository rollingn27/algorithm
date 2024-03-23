import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            long[] S = new long[N + 1];
            String[] Ns = br.readLine().split(" ");
            for (int i = 1; i <= N; i++) {
                S[i] = S[i - 1] + Long.parseLong(Ns[i - 1]);
            }

            for (int i = 0; i < M; i++) {
                String[] IJ = br.readLine().split(" ");
                int I = Integer.parseInt(IJ[0]);
                int J = Integer.parseInt(IJ[1]);
                bw.write(Long.toString(S[J] - S[I - 1]) + "\n");
            }

        }
    }

}
