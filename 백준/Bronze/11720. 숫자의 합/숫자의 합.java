import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String N = br.readLine();
            String num = br.readLine();
            int sum = 0;
            for (char c: num.toCharArray()) {
                sum += c - '0';
            }
            bw.write(Integer.toString(sum));
        }
    }
}
