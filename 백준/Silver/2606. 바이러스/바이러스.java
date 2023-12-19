import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());

            List<List<Integer>> adjacencyList = new ArrayList<>(n + 1);
            for (int i = 0; i <= n; i++) {
                adjacencyList.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                String[] pair = br.readLine().split(" ");
                int node1 = Integer.parseInt(pair[0]);
                int node2 = Integer.parseInt(pair[1]);

                adjacencyList.get(node1).add(node2);
                adjacencyList.get(node2).add(node1);
            }

            boolean[] visited = new boolean[n + 1];
            List<Integer> result = new ArrayList<>();
            Deque<Integer> queue = new LinkedList<>();
            queue.add(1);

            while (!queue.isEmpty()) {
                int key = queue.poll();

                if (!visited[key]) {
                    visited[key] = true;
                    result.add(key);

                    for (int neighbor : adjacencyList.get(key)) {
                        if (!visited[neighbor]) {
                            queue.add(neighbor);
                        }
                    }
                }
            }

            bw.write(Integer.toString(result.size() - 1));
        }
    }
}
