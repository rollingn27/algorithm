import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NM = br.readLine().split(" ");
            int n = Integer.parseInt(NM[0]);
            int m = Integer.parseInt(NM[1]);
            int[] nums = new int[n];
            int[] sums = new int[n + 1];
            String[] Ns = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(Ns[i]);
            }
            sums[0] = 0;
            sums[1] = nums[0];
            for (int i = 1; i < n; i++) {
                sums[i + 1] = nums[i] + sums[i];
            }
            for (int i = 0; i < m; i++) {
                String[] IJ = br.readLine().split(" ");
                int I = Integer.parseInt(IJ[0]);
                int J = Integer.parseInt(IJ[1]);
                bw.write(String.valueOf(sums[J] - sums[I - 1]) + "\n");
            }
        }
    }
}
