import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] changes = new int[T];
        for (int i = 0; i < T; i++) {
            changes[i] = sc.nextInt();
        }

        for (int i = 0; i < T; i++) {

            int q = changes[i] / 25;
            changes[i] = changes[i] % 25;
            int d = changes[i] / 10;
            changes[i] = changes[i] % 10;
            int n = changes[i] / 5;
            int p = changes[i] % 5;
            System.out.printf("%d %d %d %d\n", q, d, n, p);
        }        
    }
}

