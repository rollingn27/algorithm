import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            // 랜선의 개수 K, 필요한 랜선의 개수 N
            String[] KN = br.readLine().split(" ");
            int k = Integer.parseInt(KN[0]);
            int n = Integer.parseInt(KN[1]);
            int[] ks = new int[k];
            long end = 0;
            for (int i = 0; i < k; i++) {
                ks[i] = Integer.parseInt(br.readLine());
                if (end < ks[i])
                    end = ks[i];
            }

            long start = 1;
            long mid = 0;
            long sum = 0;
            while (start <= end) {
                mid = start + (end - start) / 2;
                sum = 0;
                for (int i = k - 1; i >= 0; i--) {
                    sum += (ks[i] / mid);
                }

                if (sum < n) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            bw.write(Long.toString(start - 1));

        }

    }
}
