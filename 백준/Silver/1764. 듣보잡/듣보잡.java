import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            Set<String> notHear = new HashSet<>();
            Set<String> notSee = new HashSet<>();
            for (int i = 0; i < N; i++) {
                notHear.add(br.readLine());
            }

            for (int i = 0; i < M; i++) {
                notSee.add(br.readLine());
            }

            notHear.retainAll(notSee);
            bw.write(Integer.toString(notHear.size()) + "\n");
            PriorityQueue<String> pq = new PriorityQueue<>();
            pq.addAll(notHear);
            while (!pq.isEmpty()) {
                bw.write(pq.poll() + "\n");
            }

        }
    }
}
