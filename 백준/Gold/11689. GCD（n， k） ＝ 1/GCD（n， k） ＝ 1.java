import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            long n = Long.parseLong(br.readLine());
            long result = n;
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    result = result - result / i;
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
            if (n > 1)
                result = result - result / n;
            bw.write(Long.toString(result));
        }
    }
}