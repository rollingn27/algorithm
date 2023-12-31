import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
                int compare = Math.abs(a) - Math.abs(b);
               return compare == 0 ? a - b : compare;
            });
            for (int i = 0; i < N; i++) {
                String oper = br.readLine();
                if (oper.equals("0")) {
                    if (pq.isEmpty()) {
                        bw.write("0\n");
                    } else {
                        bw.write(String.valueOf(pq.poll()) + "\n");
                    }
                } else {
                    pq.add(Integer.parseInt(oper));
                }
            }
        }
    }
}
