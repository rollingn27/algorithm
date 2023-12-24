import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(br.readLine());
            long[] fivo = new long[n + 1];
            fivo[0] = 0;
            fivo[1] = 1;

            for (int i = 2; i <= n; i++) {
                fivo[i] = fivo[i - 2] + fivo[i - 1];
            }

            bw.write(Long.toString(fivo[n]));
        }

    }
}
