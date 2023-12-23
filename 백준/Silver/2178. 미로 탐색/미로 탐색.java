import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            int[][] graph = new int[N][M];
            for (int i = 0; i < N; i++) {
                String n = br.readLine();
                for (int j = 0; j < M; j++) {
                    graph[i][j] = n.charAt(j) - '0';
                }
            }
            bfs(graph, 0, 0);
            bw.write(Integer.toString(graph[N - 1][M - 1]));
        }
    }

    public static void bfs(int[][] graph, int y, int x) {
        int[] point = new int[2];
        point[0] = y;
        point[1] = x;
        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, 1, -1 };
        Queue<int[]> queue = new LinkedList<>();
        queue.add(point);
        while(!queue.isEmpty()) {
            point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int ny = point[0] + dy[i];
                int nx = point[1] + dx[i];

                if (ny < 0 || nx < 0 || ny >= graph.length || nx >= graph[0].length || graph[ny][nx] == 0)
                    continue;

                if (graph[ny][nx] == 1) {
                    graph[ny][nx] = graph[point[0]][point[1]] + 1;
                    queue.add(new int[] { ny, nx });
                }
            }
        }
    }
}