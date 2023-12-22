import java.io.*;
import java.util.*;

class Main {
    static int count;
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer sc = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(sc.nextToken());
            int M = Integer.parseInt(sc.nextToken());
            char[][] coord = new char[N][M];
            for (int i = 0; i < N; i++) {
                String temp = br.readLine();
                char[] arr = temp.toCharArray();
                for(int j = 0; j < M; j++) {
                    coord[i][j] = arr[j];
                }
            }
            count = N * M;
            for (int i = 0; i < N; i++)
                for (int j = 0; j < M; j++)
                    dfs(coord, i, j);
            System.out.println(count);

        }

    }

    public static void dfs(char[][] coord, int y, int x) {

        if (x < 0 || y < 0 || coord[y][x] == '0') {

            return;
        }

        if (coord[y][x] == '-' && x != coord[y].length - 1) {
            coord[y][x] = '0';

            if (coord[y][1 + x] == '-') {

                dfs(coord, y, x + 1);                
                count--;

            }


        } else if (coord[y][x] == '|' && y != coord.length - 1) {
            coord[y][x] = '0';

            if (coord[y + 1][x] == '|') {

                dfs(coord, y + 1, x);                
                count--;
            }
        }


    }

}
