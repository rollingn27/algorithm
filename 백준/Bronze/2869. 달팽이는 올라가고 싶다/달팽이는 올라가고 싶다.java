import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] ABV = br.readLine().split(" ");
            long A = Long.parseLong(ABV[0]);
            long B = Long.parseLong(ABV[1]);
            long V = Long.parseLong(ABV[2]);

            long tempDays = V / (A - B);

            if (tempDays * A - (tempDays - 1) * B >= V) {
                while (tempDays * A - (tempDays - 1) * B >= V) {
                    tempDays--;
                }
            }

            tempDays += 1;

            bw.write(Long.toString(tempDays));
        }

    }
}
