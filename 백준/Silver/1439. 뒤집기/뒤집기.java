import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String S = br.readLine();
            char[] sArr = S.toCharArray();
            int result1 = 0;
            int result2 = 0;
            for (int i = 0; i < sArr.length; i++) {
                if (sArr[i] == '1') {
                    while (i + 1 < sArr.length && sArr[i + 1] == '1') {
                        i++;
                    }
                    result1++;
                }
            }

            for (int i = 0; i < sArr.length; i++) {
                if (sArr[i] == '0') {
                    while (i + 1 < sArr.length && sArr[i + 1] == '0') {
                        i++;
                    }
                    result2++;
                }
            }
            int result = result1 < result2 ? result1 : result2;
            bw.write(Integer.toString(result));
        }
    }
}
