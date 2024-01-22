import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] AB = br.readLine().split(" ");
            BigInteger A = new BigInteger(AB[0]);
            BigInteger B = new BigInteger(AB[1]);
            bw.write(A.add(B).toString());
        }
    }
}