import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] ABN = br.readLine().split(" ");
            int A = Integer.parseInt(ABN[0]);
            int B = Integer.parseInt(ABN[1]);
            int N = Integer.parseInt(ABN[2]);
            int result = A % B;
            for (int i = 0; i < N - 1; i++) {
                result *= 10;
                result %= B;
            }
            result *= 10;
            bw.write(String.valueOf(result / B));
        }
    }
}


