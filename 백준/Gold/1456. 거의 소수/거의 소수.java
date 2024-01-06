import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] AB = br.readLine().split(" ");
            long a = Long.parseLong(AB[0]);
            long b = Long.parseLong(AB[1]);
            int primeTempCount = 10000001;
            long[] prime = new long[primeTempCount];
            for (int i = 2; i < primeTempCount; i++) {
                prime[i] = i;
            }
            for (int i = 2; i * i < primeTempCount; i++) {
                if (prime[i] == 0)
                    continue;
                for (int j = i + i; j < primeTempCount; j = j + i) {
                    prime[j] = 0;
                }
            }
            List<Long> primeRange = new ArrayList<>();
            for (int i = 2; i < primeTempCount; i++) {
                if (prime[i] != 0)
                    primeRange.add(prime[i]);
            }
            int count = 0;
            for (long p: primeRange) {
                if (p * p > b) {
                    break;
                }
                long temp = p;
                long times = 2;                
                while (Math.pow(temp, times) <= b) {
                    if (Math.pow(temp, times) >= a)
                        count++;
                    times++;
                }
            }

            bw.write(Integer.toString(count));
        }
    }
}