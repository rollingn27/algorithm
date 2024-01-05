import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> neg = new PriorityQueue<>();
            List<Integer> zero = new ArrayList<>();
            List<Integer> one = new ArrayList<>();
            PriorityQueue<Integer> pos = new PriorityQueue<>((a,b) -> b - a);
            for (int i = 0; i < N; i++) {
                int temp = Integer.parseInt(br.readLine());
                if (temp > 1) {
                    pos.add(temp);
                } else if (temp == 0) {
                    zero.add(temp);
                } else if (temp == 1) {
                    one.add(temp);
                } else {
                    neg.add(temp);
                }
            }
            int sum = 0;
            while(neg.size() > 1) {
                int num1 = neg.poll();
                int num2 = neg.poll();
                sum += num1 * num2;
            }
            if (!neg.isEmpty() && zero.size() == 0) {
                sum += neg.poll();
            }
            while(pos.size() > 1) {
                int num1 = pos.poll();
                int num2 = pos.poll();
                sum += num1 * num2;
            }
            if (!pos.isEmpty()) {
                sum += pos.poll();
            }
            sum += one.size();
            bw.write(Integer.toString(sum));
        }
    }
}