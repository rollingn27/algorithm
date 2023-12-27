import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            BigInteger fac = new BigInteger("1");
            for (int i = 1; i <= N; i++) {
                fac = fac.multiply(new BigInteger(String.valueOf(i)));
            }

            String result = fac.toString();
            int count = 0;
            char[] arr = result.toCharArray();

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == '0') {
                    count++;
                } else {
                    break;
                }
            }

            bw.write(Integer.toString(count));

        }
    }

}