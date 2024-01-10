import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String checkString = br.readLine();
            while (!checkString.equals("# 0 0")) {
                String[] check = checkString.split(" ");
                int age = Integer.parseInt(check[1]);
                int weight = Integer.parseInt(check[2]);
                String result = "";
                if (age > 17 || weight >= 80) {
                    result = "Senior";
                } else
                    result = "Junior";
                bw.write(check[0] + " " + result + "\n");
                checkString = br.readLine();
            }
        }
    }
}
