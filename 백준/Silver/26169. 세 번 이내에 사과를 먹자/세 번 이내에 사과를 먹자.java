import java.io.*;

public class Main {
    static int result;
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int[][] board = new int[5][5];
            for (int i = 0; i < 5; i++) {
                String[] cs = br.readLine().split(" ");
                for (int j = 0; j < 5; j++) {
                    board[i][j] = Integer.parseInt(cs[j]);
                }
            }

            String[] rc = br.readLine().split(" ");
            int r = Integer.parseInt(rc[0]);
            int c = Integer.parseInt(rc[1]);
            int count = 3;
            int apple = 0;

            dfs(board, r, c, count, apple);
            bw.write(Integer.toString(result));

        }
    }

    public static void dfs(int[][] board, int r, int c, int count, int apple) {

        int[] dy = { 0, -1, 0, 1 };
        int[] dx = { -1, 0, 1, 0 };
        if (board[r][c] == 1) {
            apple++;
        }
        if (count <= 0) {
            if (apple >= 2) {
                result = 1;
            }
            return;
        }

        count--;

        for (int i = 0; i < 4; i++) {
            int ny = r + dy[i];
            int nx = c + dx[i];
            if (ny < 0 || ny >= 5 || nx < 0 || nx >= 5 || board[ny][nx] == -1) {
                continue;
            }

            int temp = board[r][c];
            board[r][c] = -1;
            dfs(board, ny, nx, count, apple);
            board[r][c] = temp;

        }

    }

}
