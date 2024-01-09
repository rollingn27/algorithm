import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            long sum = Long.parseLong(br.readLine());
            for (int i = 0; i < 4; i++) {                
                sum += Long.parseLong(br.readLine());
            }
            bw.write(Long.toString(sum));
        }
    }
}