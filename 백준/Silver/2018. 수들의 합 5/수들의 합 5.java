import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int count = 1;
            int start = 1;
            int end = 1;
            int sum = 1;

            while (start != N) {
                if (sum == N) {
                    count++;
                    start++;
                    end = start;
                    sum = end;
                } else if (sum > N) {
                    start++;
                    end = start;
                    sum = end;
                } else {
                    end++;
                    sum = sum + end;
                }
            }

            bw.write(String.valueOf(count));
        }
    }
}