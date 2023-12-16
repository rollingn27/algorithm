import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int count = Math.min(K, N - K);

        int result = 1;
        for (int i = 0; i < count; i++) {
            result *= N;
            N--;
        }

        for (int i = count; i > 0; i--) {
            result /= i;
        }

        System.out.println(result);
    }

}