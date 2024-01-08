import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NMKX = br.readLine().split(" ");
            int N = Integer.parseInt(NMKX[0]);
            int M = Integer.parseInt(NMKX[1]);
            int K = Integer.parseInt(NMKX[2]);
            int X = Integer.parseInt(NMKX[3]);
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i <= N; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < M; i++) {
                String[] AB = br.readLine().split(" ");
                int A = Integer.parseInt(AB[0]);
                int B = Integer.parseInt(AB[1]);
                graph.get(A).add(B);
            }
            int[] distances = new int[N + 1];
            int infi = Integer.MAX_VALUE;
            Arrays.fill(distances, infi);
            Queue<Integer> que = new LinkedList<>();
            que.add(X);
            distances[X] = 0;
            while (!que.isEmpty()) {
                Integer start = que.poll();
                int size = graph.get(start).size();
                for (int i = 0; i < size; i++) {
                    if (distances[graph.get(start).get(i)] != infi)
                        continue;
                    if (distances[graph.get(start).get(i)] == infi) {
                        distances[graph.get(start).get(i)] = distances[start] + 1;
                        que.add(graph.get(start).get(i));
                    }
                }
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 1; i < distances.length; i++) {
                if (distances[i] == K) {
                    pq.add(i);
                }
            }
            StringBuilder sb = new StringBuilder();
            if (pq.size() == 0)
                bw.write("-1");
            else {
                while (!pq.isEmpty())
                    sb.append(pq.poll() + "\n");
            }
            bw.write(sb.toString());
        }
    }
}