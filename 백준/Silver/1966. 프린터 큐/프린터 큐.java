import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                String[] NI = br.readLine().split(" ");
                int N = Integer.parseInt(NI[0]);
                int I = Integer.parseInt(NI[1]);
                String[] good = br.readLine().split(" ");
                PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
                // 인덱스, 숫자
                Queue<int[]> que = new LinkedList<>();
                for (int j = 0; j < N; j++) {
                    int temp = Integer.parseInt(good[j]);
                    que.add(new int[] { j, temp });
                    pq.add(new int[] { j, temp });

                }
                int count = 0;
                while (!que.isEmpty()) {
                    if (pq.peek()[1] == que.peek()[1]) {
                        int[] temp = que.poll();
                        pq.poll();
                        count++;
                        if (temp[0] == I)
                            break;
                    } else {
                        que.add(que.poll());
                    }
                }
                bw.write(Integer.toString(count) + "\n");
            }
        }
    }
}