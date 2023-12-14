import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++) {
            String a = sc.nextLine();
            if (a.charAt(0) == '0') {
                if (pq.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                String[] presents = a.split(" ");
                for (int j = 1; j < presents.length; j++) {
                    pq.add(Integer.parseInt(presents[j]));
                }

            }
        }
    }
}