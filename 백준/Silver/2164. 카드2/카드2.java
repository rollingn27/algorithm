import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            Queue<Integer> que = new LinkedList<>();

            for (int i = 1; i <= N; i++) {
                que.add(i);
            }

            while (que.size() > 1) {
                que.poll();
                que.add(que.poll());
            }

            bw.write(Integer.toString(que.poll()));
        }
    }

}