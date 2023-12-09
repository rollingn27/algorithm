import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();        

        if (T % 10 != 0) {
            System.out.println(-1);
            return;
        }
        int a = T / 300;
        T = T % 300;
        int b = T / 60;
        T = T % 60;
        int c = T / 10;
        System.out.printf("%d %d %d", a, b, c);
    }
}
