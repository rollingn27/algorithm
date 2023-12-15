import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while (!str.equals("0 0 0")) {
            String[] nums = str.split(" ");
            int[] numsInt = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                numsInt[i] = Integer.parseInt(nums[i]);
            }

            Arrays.sort(numsInt);

            if (numsInt[0] * numsInt[0] + numsInt[1] * numsInt[1] == numsInt[2] * numsInt[2]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

            str = sc.nextLine();
        }
    }
}
