import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcdNum;

        if (num1 > num2) {
            gcdNum = gcd(num1, num2);
        } else {
            gcdNum = gcd(num2, num1);
        }

        System.out.println(gcdNum);
        System.out.println(num1 * num2 / gcdNum);

    }

    public static int gcd(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }

        return gcd(num2, num1 % num2);
    }
}