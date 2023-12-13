import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Deque<Integer> dq = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }

        List<Integer> ansList = new ArrayList<>();
        while (!dq.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                dq.add(dq.pop());
            }
            ansList.add(dq.pop());
        }

        String result = "<";
        for (int i = 0; i < ansList.size() - 1; i++) {
            result += ansList.get(i) + ", ";
        }
        result += ansList.get(ansList.size() - 1) + ">";
        System.out.print(result);
    }
}