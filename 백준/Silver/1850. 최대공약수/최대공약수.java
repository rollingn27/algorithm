import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringBuilder sb = new StringBuilder();
            String[] AB = br.readLine().split(" ");
            long A = Long.parseLong(AB[0]);
            long B = Long.parseLong(AB[1]);
            long g = gcd(A, B);
            for (long i = 0; i < g; i++) {
                sb.append(1);
            }
            bw.write(sb.toString());
        }
    }
    public static long gcd(long a, long b) {
        if (a % b == 0)
            return b;
        return gcd(b, a % b);
    }
}