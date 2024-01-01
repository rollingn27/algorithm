import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NM = br.readLine().split(" ");
            Map<Integer, List<Integer>> graph = new HashMap<>();
            int n = Integer.parseInt(NM[0]);
            int m = Integer.parseInt(NM[1]);
            boolean[] visited = new boolean[n + 1];
            for (int i = 0; i < m; i++) {
                String[] uv = br.readLine().split(" ");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                graph.putIfAbsent(u, new ArrayList<>());
                graph.get(u).add(v);
                graph.putIfAbsent(v, new ArrayList<>());
                graph.get(v).add(u);
            }
            Deque<Integer> stack = new ArrayDeque<>();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    count++;
                    stack.push(i);
                    visited[i] = true;
                    while (!stack.isEmpty()) {
                        int node = stack.pop();
                        if (graph.containsKey(node)) {
                            for (int v: graph.get(node)) {
                                if (!visited[v]) {
                                    stack.push(v);
                                    visited[v] = true;
                                }
                            }
                        }
                    }
                }
            }

            bw.write(String.valueOf(count));
        }
    }
}
