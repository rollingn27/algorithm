import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<int []> pq = new PriorityQueue<>((a, b) -> {
            return (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0];
        });

        for (int i = 0; i < N; i++) {
            String[] Coordinates = br.readLine().split(" ");
            int[] temp = new int[2];
            temp[0] = Integer.parseInt(Coordinates[0]);
            temp[1] = Integer.parseInt(Coordinates[1]);
            pq.add(temp);
        }

        while(!pq.isEmpty()) {
            int[] coord = pq.poll();
            bw.write(coord[0] + " " + coord[1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
