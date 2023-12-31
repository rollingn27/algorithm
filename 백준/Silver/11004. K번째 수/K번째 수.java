import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NK = br.readLine().split(" ");
            String[] A = br.readLine().split(" ");
            int n = Integer.parseInt(NK[0]);
            int k = Integer.parseInt(NK[1]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(A[i]);
            }
            Arrays.sort(nums);
            bw.write(String.valueOf(nums[k - 1]));
        }
    }
}
