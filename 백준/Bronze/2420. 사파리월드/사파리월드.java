import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long N = Long.parseLong(st.nextToken());
            long M = Long.parseLong(st.nextToken());
            long ans = N - M;
            
            if (ans > 0) {
                bw.write(Long.toString(ans));
            } else {
                bw.write(Long.toString(-ans));
            }
        }
    }
}