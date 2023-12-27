import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(br.readLine());
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(nums);
            int cut = Math.round((float) n * 15 / 100);
            int sum = 0;
            for (int i = cut; i < n - cut; i++){
                sum += nums[i];
            }
            int avg = Math.round((float) sum / (n - 2 * cut));

            bw.write(Long.toString(avg));

        }
    }
}