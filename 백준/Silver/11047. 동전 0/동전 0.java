import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NK = br.readLine().split(" ");
            int N = Integer.parseInt(NK[0]);
            int K = Integer.parseInt(NK[1]);
            int[] coins = new int[N];

            for (int i = 0; i < N; i++) {
                coins[i] = Integer.parseInt(br.readLine());
            }

            int count = 0;
            for (int i = N - 1; i >= 0; i--) {
                count += K / coins[i];
                K = K % coins[i];
            }

            bw.write(Integer.toString(count));
        }
    }
}