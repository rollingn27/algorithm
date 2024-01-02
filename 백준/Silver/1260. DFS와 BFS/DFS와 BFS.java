import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NMV = br.readLine().split(" ");
            int N = Integer.parseInt(NMV[0]);
            int M = Integer.parseInt(NMV[1]);
            int V = Integer.parseInt(NMV[2]);
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < M; i++) {
                String[] ab = br.readLine().split(" ");
                int a = Integer.parseInt(ab[0]);
                int b = Integer.parseInt(ab[1]);
                graph.get(a - 1).add(b);
                graph.get(b - 1).add(a);
            }

            for (int i = 0; i < N; i++) {
                Collections.sort(graph.get(i));
            }
            boolean[] visited = new boolean[N];
            StringBuilder sb = new StringBuilder();
            dfs(graph, V, visited, sb);
            bw.write(sb.toString() + "\n");
            Arrays.fill(visited, false);
            sb = new StringBuilder();
            Queue<Integer> que = new LinkedList<>();
            que.add(V);
            while (!que.isEmpty()) {
                int temp = que.poll();
                visited[temp - 1] = true;
                sb.append(temp + " ");
                for (int i: graph.get(temp - 1)) {
                    if (!visited[i - 1]) {
                        que.add(i);
                        visited[i - 1] = true;
                    }

                }
            }
            bw.write(sb.toString());

        }
    }

    public static void dfs(List<List<Integer>> graph, int V, boolean[] visited, StringBuilder sb) {
        sb.append(V + " ");
        visited[V - 1] = true;
        for (int i: graph.get(V - 1)) {
            if (!visited[i - 1]) {
                dfs(graph, i, visited, sb);
            }
        }
    }
}