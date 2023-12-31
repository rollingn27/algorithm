import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            List<int[]> A = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                A.add(new int[] {i, Integer.parseInt(br.readLine())});
            }
            Collections.sort(A, (a,b) -> { return a[1] - b[1]; });
            int max = 0;
            for (int i = 0; i < N; i++) {
                if (A.get(i)[0] - i > max) {
                    max = A.get(i)[0] - i;
                }
            }
            bw.write(String.valueOf(max + 1));
        }
    }
}
