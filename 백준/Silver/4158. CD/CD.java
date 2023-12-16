import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);

        while (true) {
            String[] strs = br.readLine().split(" ");
            int n = Integer.parseInt(strs[0]);
            int m = Integer.parseInt(strs[1]);
            if (n == 0 && m == 0) {
                break;
            }

            int[] num1 = new int[n];
            int[] num2 = new int[m];

            for (int i = 0; i < n; i++) {
                num1[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < m; i++) {
                num2[i] = Integer.parseInt(br.readLine());
            }

            Set<Integer> set = new HashSet<>();
            Set<Integer> intersection = new HashSet<>();

            for (int num: num1) {
                set.add(num);
            }

            for (int num: num2) {
                if (set.contains(num)) {
                    intersection.add(num);
                }
            }
            bw.write(intersection.size() + "\n");
            bw.flush();
        }

        br.close();
        bw.close();

    }
}
