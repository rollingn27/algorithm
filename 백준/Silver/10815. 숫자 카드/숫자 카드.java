import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Set<String> numList = new HashSet<>();
            for (int i = 0; i < n; i++) {
                numList.add(st.nextToken());
            }

            int m = Integer.parseInt(br.readLine());            
            st = new StringTokenizer(br.readLine());            

            for (int i = 0; i < m; i++) {
                if (numList.contains(st.nextToken())) {
                    bw.write("1 ");
                } else {
                    bw.write("0 ");
                }
            }
        }

    }
}
