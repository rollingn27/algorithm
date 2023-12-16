import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Map<String, String> logMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] logs = br.readLine().split(" ");
            logMap.put(logs[0], logs[1]);

        }

        List<String> ans = new ArrayList<>();

        for(Map.Entry<String, String> log: logMap.entrySet()) {
            if (log.getValue().equals("enter")) {
                ans.add(log.getKey());
            }
        }

        Collections.sort(ans, (a, b) -> b.compareTo(a));
        for (int i = 0; i < ans.size(); i++) {
            bw.write(ans.get(i) + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
