import java.util.*;
import java.io.*;

class Main {
    static boolean arrive;
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            Map<Integer, List<Integer>> graph = new HashMap<>();
            for (int i = 0; i < M; i++) {
                String[] ab = br.readLine().split(" ");
                int a = Integer.parseInt(ab[0]);
                int b = Integer.parseInt(ab[1]);
                graph.putIfAbsent(a, new ArrayList<>());
                graph.putIfAbsent(b, new ArrayList<>());
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            boolean[] friend = new boolean[N];
            for (int i = 0; i < N; i++) {
                dfs(graph, i, 1, friend);
                if (arrive) {
                    break;
                }
            }
            if (arrive)
                bw.write("1");
            else
                bw.write("0");
        }
    }

    public static void dfs(Map<Integer, List<Integer>> graph, int a, int depth, boolean[] friend) {
        if (depth == 5) {
            arrive = true;
            return;
        }
        friend[a] = true;
        if (graph.containsKey(a)) {
            for (int i: graph.get(a)) {
                if (!friend[i]) {
                    dfs(graph, i, depth + 1, friend);
                }
            }
        }
        friend[a] = false;
    }
}