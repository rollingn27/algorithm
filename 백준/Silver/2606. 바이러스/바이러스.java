import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());
            
            boolean[][] matrix = new boolean[n + 1][n + 1];

            for (int i = 0; i < m; i++) {
                String[] pair = br.readLine().split(" ");
                int node1 = Integer.parseInt(pair[0]);
                int node2 = Integer.parseInt(pair[1]);
                
                matrix[node1][node2] = true;
                matrix[node2][node1] = true;
            }
            
            boolean[] visited = new boolean[n + 1];
            List<Integer> result = new ArrayList<>();
            Deque<Integer> queue = new LinkedList<>();
            queue.add(1);

            while (!queue.isEmpty()) {
                int key = queue.poll();

                if (!visited[key]) {
                    visited[key] = true;
                    result.add(key);
                    
                    for (int i = 1; i <= n; i++) {
                        if (matrix[key][i]) {
                            queue.add(i);
                        }
                    }
                }
            }

            bw.write(Integer.toString(result.size() - 1));
        }
    }
}
