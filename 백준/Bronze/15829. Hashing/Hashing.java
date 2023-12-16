import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String str = sc.next();
        int[] nums = new int[L];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = str.charAt(i) - 96;
        }

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int r = 1;
            for (int j = 1; j <= i; j++) {
                r *= 31;
            }

            sum += nums[i] * r;
        }

        System.out.println(sum % 1234567891);

    }
}