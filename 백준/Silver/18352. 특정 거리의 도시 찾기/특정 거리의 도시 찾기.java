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
            int[] distances = new int[N];
            Arrays.fill(distances, 1000000);
            Map<Integer, List<Integer>> graph = new HashMap<>();
            for (int i = 0; i < M; i++) {
                String[] AB = br.readLine().split(" ");
                graph.putIfAbsent(Integer.parseInt(AB[0]), new LinkedList<>());
                graph.get(Integer.parseInt(AB[0])).add(Integer.parseInt(AB[1]));
            }

            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
            pq.add(new int[] {0, X});
            distances[X - 1] = 0;
            List<Integer> result = new LinkedList<>();
            while(!pq.isEmpty()) {
                int[] info = pq.poll();
                if (distances[info[1] - 1] < info[0]) {
                    continue;
                }

                if (graph.get(info[1]) != null) {
                    for (int i: graph.get(info[1])) {
                        if (info[0] < distances[i - 1]) {
                            distances[i - 1] = info[0] + 1;
                            pq.add(new int[] { distances[i - 1], i});
                        }
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (distances[i] == K) {
                    count++;
                }
            }

            if (count == 0) {
                bw.write("-1");
            } else {
                for (int i = 0; i < N; i++) {
                    if (distances[i] == K) {
                        bw.write(Integer.toString(i + 1) + "\n");
                    }
                }
            }
        }
    }

}