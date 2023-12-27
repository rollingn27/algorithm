import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int[] nums = new int[N];

            for (int i = 0; i < N; i++) {
                nums[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(nums);
            for (int i = 0; i < N; i++) {
                bw.write(Integer.toString(nums[i]) + "\n");
            }

        }
    }

}