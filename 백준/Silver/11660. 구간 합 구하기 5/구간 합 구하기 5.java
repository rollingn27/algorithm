import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] NM = br.readLine().split(" ");
            int n = Integer.parseInt(NM[0]);
            int m = Integer.parseInt(NM[1]);
            int[][] A = new int[n + 1][n + 1];
            int[][] D = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                String[] row = br.readLine().split(" ");
                for (int j = 1; j <= n; j++) {
                    A[i][j] = Integer.parseInt(row[j - 1]);
                    D[i][j] = D[i - 1][j] + D[i][j - 1] + A[i][j] - D[i - 1][j - 1];
                }
            }
            for (int i = 0; i < m; i++) {
                String[] coords = br.readLine().split(" ");
                int x1 = Integer.parseInt(coords[0]);
                int y1 = Integer.parseInt(coords[1]);
                int x2 = Integer.parseInt(coords[2]);
                int y2 = Integer.parseInt(coords[3]);
                bw.write(String.valueOf(D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1]) + "\n");
            }
        }
    }
}