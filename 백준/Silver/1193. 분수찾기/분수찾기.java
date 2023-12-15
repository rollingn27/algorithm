import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= X; i++) {
            sum += i;
            count++;
            if (sum >= X) {
                break;
            }

        }

        int idx = 0;

        if (count % 2 == 0) {
            idx = sum - X;
        } else {
            idx = -(X - sum);
        }

        int one = count - idx;
        int two = count - one + 1;

        if (count % 2 == 0)
            System.out.printf("%d/%d", one, two);
        else {
            System.out.printf("%d/%d", two, one);
        }

    }
}