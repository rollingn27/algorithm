import java.io.*;
import java.math.*;

class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] nm = br.readLine().split(" ");
            BigInteger N = new BigInteger(nm[0]);
            BigInteger M = new BigInteger(nm[1]);

            BigInteger n_m = N.subtract(M);
            BigInteger p = N;
            BigInteger r = n_m;
            BigInteger one = new BigInteger("1");

            while (n_m.compareTo(new BigInteger("1")) > 0) {
                N = N.subtract(one);
                n_m = n_m.subtract(one);
                p = p.multiply(N);
                r = r.multiply(n_m);

            }

            bw.write(p.divide(r).toString());

        }
    }

}
