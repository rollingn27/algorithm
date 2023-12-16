import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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

            int p1 = 0;
            int p2 = 0;
            int count = 0;            
            while (p1 < n && p2 < m) {
                if (num1[p1] == num2[p2]) {
                    count++;
                    p1++;
                    p2++;
                } else if (num1[p1] < num2[p2]) {
                    p1++;
                } else {
                    p2++;
                }
            }            

            bw.write(Integer.toString(count) + "\n");
            bw.flush();
        }

        br.close();
        bw.close();

    }
}
