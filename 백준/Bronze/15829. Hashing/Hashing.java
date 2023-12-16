import java.math.BigInteger;
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

        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < nums.length; i++) {
            BigInteger r = BigInteger.ONE;
            for (int j = 1; j <= i; j++) {
                r = r.multiply(BigInteger.valueOf(31));
            }

            sum = sum.add(BigInteger.valueOf(nums[i]).multiply(r));
        }

        BigInteger modValue = BigInteger.valueOf(1234567891);
        System.out.println(sum.mod(modValue));
    }
}
