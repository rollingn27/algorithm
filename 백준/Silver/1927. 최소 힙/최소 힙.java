import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                if (!pq.isEmpty()) {
                    System.out.println(pq.poll());
                } else {
                    System.out.println(0);
                }
            } else {
                pq.add(num);
            }
        }
    }
}