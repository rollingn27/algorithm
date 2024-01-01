import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String num = br.readLine();
            StringBuilder sb = new StringBuilder();
            while (!num.equals("0")) {
                boolean isPalindrome = true;
                for (int i = 0; i < num.length() / 2; i++) {
                    if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                        isPalindrome = false;
                    }
                }
                if (isPalindrome)
                    sb.append("yes\n");
                else
                    sb.append("no\n");
                num = br.readLine();
            }
            bw.write(sb.toString());
        }
    }
}
