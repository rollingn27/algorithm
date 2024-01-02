import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] str = br.readLine().split(" ");
            int num1 = Integer.parseInt(str[0]);
            int num2 = Integer.parseInt(str[1]);
            int gcdNum = gcd(num1, num2);
            StringBuilder sb = new StringBuilder();
            sb.append(gcdNum + "\n");
            sb.append(num1 * num2 / gcdNum);
            bw.write(sb.toString());
        }
    }

    public static int gcd(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return gcd(num2, num1 % num2);
    }
}