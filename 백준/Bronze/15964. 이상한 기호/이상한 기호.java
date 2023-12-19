import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] AB = br.readLine().split(" ");
            long ans = (Long.parseLong(AB[0]) + Long.parseLong(AB[1])) * (Long.parseLong(AB[0]) - Long.parseLong(AB[1]));
            bw.write(Long.toString(ans));
        }

    }
}
