import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            boolean prime = true;
            if (nums[i] < 2) {
                continue;
            }
            for (int j = 2; j < nums[i]; j++) {
                if (nums[i] % j == 0) {
                    prime = false;
                    break;
                }

            }
            if (prime) {
                count++;
            }
        }

        System.out.println(count);
    }
}
