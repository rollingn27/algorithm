import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String testCase = br.readLine();
            while (!testCase.equals("0 0")) {
                int n1 = Integer.parseInt(testCase.split(" ")[0]);
                int n2 = Integer.parseInt(testCase.split(" ")[1]);
                if (n1 > n2) {
                    bw.write("Yes\n");
                } else {
                    bw.write("No\n");
                }

                testCase = br.readLine();
            }

        }
    }
}