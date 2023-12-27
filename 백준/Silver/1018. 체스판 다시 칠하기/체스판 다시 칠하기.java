import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] NM = br.readLine().split(" ");
            int n = Integer.parseInt(NM[0]);
            int m = Integer.parseInt(NM[1]);
            char[][] board = new char[n][m];

            for (int i = 0; i < n; i++) {
                String col = br.readLine();
                for (int j = 0; j < m; j++) {
                    board[i][j] = col.charAt(j);
                }
            }

            int nCount = n - 8 + 1;
            int mCount = m - 8 + 1;            
            int result = 64;
            for (int i = 0; i < nCount; i++) {
                for (int j = 0; j < mCount; j++) {
                    int count1 = 0;
                    int count2 = 0;
                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (((k + i + l + j) % 2 == 0) && (board[k + i][l + j] == 'B')) {
                                count1++;
                            } else if (((k + i + l + j) % 2 != 0) && (board[k + i][l + j] == 'W'))
                                count1++;
                        }
                    }

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (((k + i + l + j) % 2 != 0) && (board[k + i][l + j] == 'B')) {
                                count2++;
                            } else if (((k + i + l + j) % 2 == 0) && (board[k + i][l + j] == 'W'))
                                count2++;
                        }
                    }

                    result = Math.min(result, count1);
                    result = Math.min(result, count2);

                }
            }


            bw.write(Integer.toString(result));
        }
    }

}