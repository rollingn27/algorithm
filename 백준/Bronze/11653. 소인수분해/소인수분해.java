import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        for (int i = 2; i <= n; i++) {
            while (m % i == 0) {
                System.out.println(i);
                m = m / i;
            }
        }
    }
}