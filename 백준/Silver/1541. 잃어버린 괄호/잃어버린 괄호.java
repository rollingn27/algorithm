import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] min = br.readLine().split("-");
            int sum = 0;
            for (int i = 0; i < min.length; i++) {
                String[] plus = min[i].split("\\+");
                int temp = 0;
                for (int j = 0; j < plus.length; j++) {
                    temp += Integer.parseInt(plus[j]);
                }
                if (i == 0) {
                    sum += temp;
                } else {
                    sum -= temp;
                }
            }
            bw.write(Integer.toString(sum));
        }
    }
}