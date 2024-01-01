import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NMV = br.readLine().split(" ");
            Map<Integer, PriorityQueue<Integer>> graph1 = new HashMap<>();
            Map<Integer, PriorityQueue<Integer>> graph2 = new HashMap<>();
            int n = Integer.parseInt(NMV[0]);
            int m = Integer.parseInt(NMV[1]);
            int v = Integer.parseInt(NMV[2]);
            boolean[] visited = new boolean[n + 1];
            if (n == 1) {
                bw.write("1\n1");
            } else {
                for (int i = 0; i < m; i++) {
                    String[] uv = br.readLine().split(" ");
                    int s = Integer.parseInt(uv[0]);
                    int e = Integer.parseInt(uv[1]);
                    graph1.putIfAbsent(s, new PriorityQueue<>((a,b) -> b - a));
                    graph1.get(s).add(e);
                    graph1.putIfAbsent(e, new PriorityQueue<>((a,b) -> b - a));
                    graph1.get(e).add(s);
                    graph2.putIfAbsent(s, new PriorityQueue<>());
                    graph2.get(s).add(e);
                    graph2.putIfAbsent(e, new PriorityQueue<>());
                    graph2.get(e).add(s);
                }
                Deque<Integer> stack = new ArrayDeque<>();
                stack.push(v);
                List<Integer> result = new LinkedList<>();
                while (!stack.isEmpty()) {
                    int node = stack.pop();
                    if (visited[node])
                        continue;
                    result.add(node);
                    visited[node] = true;
                    if (result.size() == n)
                        break;
                    if (graph1.containsKey(node)) {
                        while (!graph1.get(node).isEmpty()) {
                            int temp = graph1.get(node).poll();
                            if (!visited[temp]) {
                                stack.push(temp);
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (int s: result) {
                    sb.append(s + " ");
                }
                sb.append("\n");
                Arrays.fill(visited, false);
                result.clear();
                Queue<Integer> que = new LinkedList<>();
                que.add(v);
                while (!que.isEmpty()) {
                    int node = que.poll();

                    if (visited[node])
                        continue;
                    result.add(node);
                    visited[node] = true;
                    if (result.size() == n)
                        break;
                    if (graph2.containsKey(node)) {
                        while (!graph2.get(node).isEmpty()) {
                            int temp = graph2.get(node).poll();
                            if (!visited[temp]) {
                                que.add(temp);
                            }
                        }
                    }
                }
                for (int s: result) {
                    sb.append(s + " ");
                }
                sb.append("\n");
                bw.write(sb.toString());
            }
        }
    }
}
