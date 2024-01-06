import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] MN = br.readLine().split(" ");
            int m = Integer.parseInt(MN[0]);
            int n = Integer.parseInt(MN[1]);
            StringBuilder sb = new StringBuilder();
            for (int i = m; i <= n; i++) {
                if (i == 1) {
                    continue;
                }
                if (i == 2) {
                    sb.append(i + "\n");
                    continue;
                }
                boolean prime = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime)
                    sb.append(i + "\n");
            }
            bw.write(sb.toString());
        }
    }
}