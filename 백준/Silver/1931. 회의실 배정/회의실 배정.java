import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
                int compare = a[1] - b[1];
                return compare == 0 ? a[0] - b[0] : compare;
            });
            for (int i = 0; i < N; i++) {
                String[] se = br.readLine().split(" ");
                int s = Integer.parseInt(se[0]);
                int e = Integer.parseInt(se[1]);
                pq.add(new int[] {s, e});
            }
            int count = 0;
            int end = -1;
            for (int i = 0; i < N; i++) {
                int[] temp = pq.poll();
                if (temp[0] >= end) {
                    end = temp[1];
                    count++;
                }
            }
            bw.write(Integer.toString(count));
        }
    }
}