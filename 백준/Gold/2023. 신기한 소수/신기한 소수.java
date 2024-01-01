import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            List<String> primeList = new ArrayList<>();
            primeList.add("2");
            primeList.add("3");
            primeList.add("5");
            primeList.add("7");

            StringBuilder sb = new StringBuilder();
            if (N == 1) {
                for (String s: primeList) {
                    sb.append(s + "\n");
                }
            } else {
                dfs(primeList, N);
                for (String s: primeList) {
                    sb.append(s + "\n");
                }
            }
            bw.write(sb.toString());
        }
    }

    public static void dfs(List<String> primeList, int n) {

        if (n == 1) {
            return;
        }

        List<String> result = new ArrayList<>();

        for (String prime: primeList) {
            for (int i = 1; i < 10; i = i + 2) {
                boolean flag = true;
                int temp = Integer.parseInt(prime + i);
                for (int j = 3; j < temp; j++) {
                    if (temp % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result.add(String.valueOf(temp));
                }
            }
        }

        primeList.clear();
        primeList.addAll(result);

        dfs(primeList, n - 1);
    }

}
