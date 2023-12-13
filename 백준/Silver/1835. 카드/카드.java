import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> dq = new LinkedList<>();        
        dq.add(N);
        for (int i = N - 1; i > 0; i--) {

            dq.add(i);
            for (int j = 0; j < i; j++) {

                dq.add(dq.pop());
            }
        }

        while (!dq.isEmpty()) {
            System.out.println(dq.pollLast());
        }
    }
}