import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            Map<String, Integer> employeeMap = new HashMap<>();
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 7; j++) {
                    String temp = st.nextToken();
                    if (!temp.equals("-")) {
                        employeeMap.put(temp, employeeMap.getOrDefault(temp, 0) + 4);
                    }
                }
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 7; j++) {
                    String temp = st.nextToken();
                    if (!temp.equals("-")) {
                        employeeMap.put(temp, employeeMap.getOrDefault(temp, 0) + 6);
                    }
                }
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 7; j++) {
                    String temp = st.nextToken();
                    if (!temp.equals("-")) {
                        employeeMap.put(temp, employeeMap.getOrDefault(temp, 0) + 4);
                    }
                }
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 7; j++) {
                    String temp = st.nextToken();
                    if (!temp.equals("-")) {
                        employeeMap.put(temp, employeeMap.getOrDefault(temp, 0) + 10);
                    }
                }
            }

            List<Integer> workTimes = new ArrayList<>();
            for (Map.Entry<String, Integer> map: employeeMap.entrySet()) {
                workTimes.add(map.getValue());
            }

            if (workTimes.size() == 0) {
                bw.write("Yes\n");
                return;
            }

            Collections.sort(workTimes);
            if (workTimes.get(workTimes.size() - 1) - workTimes.get(0) <= 12) {
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }

        }

    }
}
