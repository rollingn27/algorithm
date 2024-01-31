import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            bw.write(Long.toString(fac(N)));

        }
    }

    public static long fac(int n) {
        if (n <= 1)
            return 1;
        return n * fac(n - 1);
    }
}