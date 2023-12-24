import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            int[] dp = new int[N + 1];
            Map<Integer, Integer> graph = new HashMap<>();
            for (int i = 2; i <= N; i++) {
                int choice = 1;
                dp[i] = dp[i - 1] + 1;
                if (i % 2 == 0) {
                    if (dp[i] > dp[i / 2] + 1) {
                        choice = 2;
                    }
                    dp[i] = Math.min(dp[i], dp[i / 2] + 1);

                }

                if (i % 3 == 0) {
                    if (dp[i] > dp[i / 3] + 1) {
                        choice = 3;
                    }
                    dp[i] = Math.min(dp[i], dp[i / 3] + 1);
                }

                if (choice == 1) {
                    graph.put(i, i - 1);
                } else if (choice == 2) {
                    graph.put(i, i / 2);
                } else {
                    graph.put(i, i / 3);
                }

            }

            bw.write(Integer.toString(dp[N]) + "\n");
            Deque<Integer> deque = new LinkedList<>();
            if (graph.containsKey(N)) {
                deque.add(graph.get(N));
            }
            bw.write(Integer.toString(N) + " ");
            while (!deque.isEmpty()) {
                int temp = deque.poll();
                bw.write(Integer.toString(temp) + " ");
                if (graph.containsKey(temp)) {
                    deque.add(graph.get(temp));
                }
            }

        }
    }

}
