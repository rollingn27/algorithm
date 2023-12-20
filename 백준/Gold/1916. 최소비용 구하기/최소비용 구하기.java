import java.io.*;
import java.util.*;

class Main {
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 도시의 개수
        int M = Integer.parseInt(br.readLine()); // 버스의 개수

        List<int[]>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph[start].add(new int[]{end, cost});
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int startCity = Integer.parseInt(st.nextToken());
        int endCity = Integer.parseInt(st.nextToken());

        int[] distances = dijkstra(graph, startCity, N);

        System.out.println(distances[endCity]);
    }

    static int[] dijkstra(List<int[]>[] graph, int start, int N) {
        int[] distances = new int[N + 1];
        Arrays.fill(distances, INF);
        distances[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{start, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentCity = current[0];
            int currentCost = current[1];

            if (currentCost > distances[currentCity]) {
                continue;
            }

            for (int[] neighbor : graph[currentCity]) {
                int nextCity = neighbor[0];
                int nextCost = currentCost + neighbor[1];

                if (nextCost < distances[nextCity]) {
                    distances[nextCity] = nextCost;
                    pq.add(new int[]{nextCity, nextCost});
                }
            }
        }

        return distances;
    }
}
