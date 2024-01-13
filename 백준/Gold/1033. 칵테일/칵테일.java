import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            List<List<int[]>> graph = new ArrayList<>();
            boolean[] visited = new boolean[N];
            long[] D = new long[N];
            long lcm = 1;
            for (int i = 0; i < N; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < N - 1; i++) {
                String[] abpq = br.readLine().split(" ");
                int a = Integer.parseInt(abpq[0]);
                int b = Integer.parseInt(abpq[1]);
                int p = Integer.parseInt(abpq[2]);
                int q = Integer.parseInt(abpq[3]);
                graph.get(a).add(new int[] { b, p, q });
                graph.get(b).add(new int[] { a, q, p });

                lcm *= (p * q / gcd(p, q));
            }
            D[0] = lcm;
            dfs(0, graph, visited, D);
            long totalGcd = D[0];
            for (int i = 1; i < N; i++) {
                totalGcd = gcd(totalGcd, D[i]);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(D[i] / totalGcd + " ");
            }
            bw.write(sb.toString());
        }
    }

    public static void dfs(int idx, List<List<int[]>> graph, boolean[] visited, long[] D) {
        visited[idx] = true;
        int size = graph.get(idx).size();
        for (int i = 0; i < size; i++) {
            if (!visited[graph.get(idx).get(i)[0]]) {
                D[graph.get(idx).get(i)[0]] = D[idx] * graph.get(idx).get(i)[2] / graph.get(idx).get(i)[1];
                dfs(graph.get(idx).get(i)[0], graph, visited, D);
            }
        }
    }

    public static long gcd(long a, long b) {
        if (a % b == 0)
            return b;
        return gcd(b, a % b);
    }
}
