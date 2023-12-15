import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int y = 0;
            int x = 0;

            if (N % H == 0) {
                y = H;
                x += N / H;
            } else {
                y = N % H;
                x += N / H + 1;
            }

            String ans = "";
            ans += y;
            if (x < 10) {
                ans += "0";
            }
            ans += x;

            System.out.println(ans);
        }
    }
}

