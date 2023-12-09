import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int length = 1;
            for (int i = 0; i < N; i++) {
                length *= 3;
            }

            String ans = stringDivided(length, 0, N - 1);
            System.out.println(ans);    
        }
        
    }

    public static String stringDivided(int length, int start, int end) {
        if (length == 1)
            return "-";
        int a = length / 3;
        int b = length - a;
        String s1 = stringDivided(a, start, a - 1);
        String s2 = " ".repeat(a);
        String s3 = stringDivided(a, b, end);

        return s1 + s2 + s3;

    }
}
