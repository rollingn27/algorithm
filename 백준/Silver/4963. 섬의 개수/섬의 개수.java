import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String wh = br.readLine();
            while (!wh.equals("0 0")) {
                String[] WH = wh.split(" ");
                int w = Integer.parseInt(WH[0]);
                int h = Integer.parseInt(WH[1]);

                int count = 0;
                // 1은 땅 0은 바다
                int[][] map = new int[h][w];

                for (int i = 0; i < h; i++) {
                    String[] ws = br.readLine().split(" ");
                    for (int j = 0; j < w; j++) {
                        map[i][j] = Integer.parseInt(ws[j]);
                    }
                }

                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (map[i][j] == 1) {
                            dfs(map, i, j);
                            count++;
                        }
                    }
                }
                bw.write(Integer.toString(count) + "\n");
                wh = br.readLine();
            }
        }
    }

    public static void dfs(int[][] map, int h, int w) {
        if (h < 0 || w < 0 || h >= map.length || w >= map[0].length || map[h][w] != 1) {
            return;
        }
        map[h][w] = 0;
        dfs(map, h, w + 1);
        dfs(map, h, w - 1);
        dfs(map, h - 1, w);
        dfs(map, h + 1, w);
        dfs(map, h - 1, w + 1);
        dfs(map, h + 1, w + 1);
        dfs(map, h - 1, w - 1);
        dfs(map, h + 1, w - 1);
    }
}
