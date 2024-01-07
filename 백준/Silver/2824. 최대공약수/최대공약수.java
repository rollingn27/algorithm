import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            String[] Ns = br.readLine().split(" ");
            int M = Integer.parseInt(br.readLine());
            String[] Ms = br.readLine().split(" ");
            BigInteger A = new BigInteger("1");
            BigInteger B = new BigInteger("1");
            for (int i = 0; i < N; i++) {
                A = A.multiply(new BigInteger(Ns[i]));
            }
            for (int i = 0; i < M; i++) {
                B = B.multiply(new BigInteger(Ms[i]));
            }
            BigInteger gcd = A.gcd(B);
            String gcdStr = gcd.toString();
            if (gcdStr.length() > 9) {
                Deque<Character> stack = new ArrayDeque<>();
                Deque<Character> stack2 = new ArrayDeque<>();
                for (char c: gcdStr.toCharArray()) {
                    stack.push(c);
                }
                for (int i = 0; i < 9; i++) {
                    stack2.push(stack.pop());
                }
                StringBuilder sb = new StringBuilder();
                while (!stack2.isEmpty()) {
                    sb.append(stack2.pop());
                }
                bw.write(sb.toString());
            } else {
                bw.write(gcdStr);
            }
        }
    }
}