import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
                return a[1] - b[1] == 0 ? a[0] - b[0] : a[1] - b[1];
            });
            for (int i = 0; i < N; i++) {
                String[] xy = br.readLine().split(" ");
                int x = Integer.parseInt(xy[0]);
                int y = Integer.parseInt(xy[1]);
                pq.add(new int[] {x, y});
            }

            while(!pq.isEmpty()) {
                int[] temp = pq.poll();
                bw.write(Integer.toString(temp[0]) + " " + Integer.toString(temp[1]) + "\n");
            }

        }
    }
}