import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] NM = br.readLine().split(" ");
            int N = Integer.parseInt(NM[0]);
            int M = Integer.parseInt(NM[1]);
            Map<Integer, String> numberToName = new HashMap<>();
            Map<String, Integer> nameToNumber = new HashMap<>();
            for (int i = 1; i <= N; i++) {
                String temp = br.readLine();
                numberToName.put(i, temp);
                nameToNumber.put(temp, i);
            }

            for (int i = 0; i < M; i++) {
                String m = br.readLine();
                String checkDigit = "\\d+";
                if (m.matches(checkDigit)) {
                    bw.write(numberToName.get(Integer.parseInt(m)) + "\n");
                } else {
                    bw.write(Integer.toString(nameToNumber.get(m)) + "\n");
                }
            }

        }
    }
}
