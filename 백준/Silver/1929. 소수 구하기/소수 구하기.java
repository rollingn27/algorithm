import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] MN = br.readLine().split(" ");
            int m = Integer.parseInt(MN[0]);
            int n = Integer.parseInt(MN[1]);
            int[] prime = new int[n + 1];
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <= n; i++) {
                prime[i] = i;
            }
            for (int i = 2; i * i <= n; i++) {
                if (prime[i] == 0)
                    continue;
                for (int j = i + i; j <= n; j = j + i) {
                    prime[j] = 0;
                }
            }
            for (int i = m; i <= n; i++) {
                if (i == 1)
                    continue;
                if (prime[i] != 0)
                    sb.append(prime[i] + "\n");
            }
            bw.write(sb.toString());
        }
    }
}