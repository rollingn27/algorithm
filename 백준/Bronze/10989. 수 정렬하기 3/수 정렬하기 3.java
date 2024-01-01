import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int[] numCount = new int[10001];
            for (int i = 0; i < N; i++) {
                numCount[Integer.parseInt(br.readLine())]++;
            }
            for (int i = 0; i < 10001; i++) {
                if (numCount[i] == 0)
                    continue;
                for (int j = 0; j < numCount[i]; j++) {
                    bw.write(String.valueOf(i) + "\n");
                }
            }
        }
    }
}
