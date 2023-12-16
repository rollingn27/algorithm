import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            words.add(br.readLine());
        }
        String reverse = "";
        for (int i = 0; i < N; i++) {
            List<Character> chr = new ArrayList<>();
            for (char c: words.get(i).toCharArray()) {
                chr.add(c);
            }
            Collections.reverse(chr);
            reverse = "";
            for (char c: chr) {
                reverse += c;
            }

            if (words.contains(reverse)) {
                break;
            }
        }

        int mid = reverse.length() / 2;
        bw.write(Integer.toString(reverse.length()) + " " + reverse.charAt(mid));
        bw.flush();
        bw.close();

    }
}
