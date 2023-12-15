import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nums = str.split(" ");
        long sum = 0;
        for (String num: nums) {
            long temp = Long.parseLong(num); 
            sum += temp;
        }

        System.out.println(sum);
    }
}