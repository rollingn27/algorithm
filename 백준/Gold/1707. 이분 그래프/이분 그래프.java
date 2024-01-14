import java.io.*;
import java.util.*;

public class Main {
    static boolean isBinary = false;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int K = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < K; i++) {
                String[] VE = br.readLine().split(" ");
                int V = Integer.parseInt(VE[0]);
                int E = Integer.parseInt(VE[1]);
                List<List<Integer>> graph = new ArrayList<>();
                boolean[] visited = new boolean[V + 1];
                int[] binaryCheck = new int[V + 1];
                isBinary = true;
                for (int j = 0; j <= V; j++) {
                    graph.add(new ArrayList<>());
                }

                for (int j = 0; j < E; j++) {
                    String[] uv = br.readLine().split(" ");
                    int u = Integer.parseInt(uv[0]);
                    int v = Integer.parseInt(uv[1]);
                    graph.get(u).add(v);
                    graph.get(v).add(u);
                }

                for (int j = 1; j <= V; j++) {
                    if (isBinary) {
                        dfs(j, graph, visited, binaryCheck);
                    } else {
                        break;
                    }
                }
                if (isBinary) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
            bw.write(sb.toString());
        }
    }

    public static void dfs(int idx, List<List<Integer>> graph, boolean[] visited, int[] binaryCheck) {
        visited[idx] = true;

        int size = graph.get(Integer.valueOf(idx)).size();
        for (int i = 0; i < size; i++) {
            int next = graph.get(Integer.valueOf(idx)).get(i);
            if (!visited[next]) {
                binaryCheck[next] = (binaryCheck[idx] + 1) % 2;
                dfs(next, graph, visited, binaryCheck);
            } else if (binaryCheck[idx] == binaryCheck[next]) {
                isBinary = false;
            }
        }
    }

}
