import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] SE = br.readLine().split(" ");
            long s = Long.parseLong(SE[0]);
            long e = Long.parseLong(SE[1]);
            int size = (int) (e - s + 1);
            boolean[] noSqr = new boolean[size];
            int count = 0;
            for (long i = 2; i * i <= e; i++) {
                long pow = i * i;
                long start = s / pow;
                if (s % pow != 0)
                    start++;
                for (long j = start; j * pow <= e; j++) {
                    noSqr[(int)((j * pow) - s)] = true;
                }
            }
            for (int i = 0; i < size; i++) {
                if (!noSqr[i])
                    count++;
            }
            bw.write(Integer.toString(count));
        }
    }
}