import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(br.readLine());
            String[] students = br.readLine().split(" ");
            Map<String, Integer> studentMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                studentMap.put(students[i], 0);
            }
            for (int i = 0; i < n; i++) {
                String[] likes = br.readLine().split(" ");
                for (String like: likes) {
                    studentMap.put(like, studentMap.getOrDefault(like, 0) + 1);
                }
            }
            PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
                int compare = b.getValue() - a.getValue();

                return compare == 0 ? a.getKey().compareTo(b.getKey()) : compare;
            });
            pq.addAll(studentMap.entrySet());
            while (!pq.isEmpty()) {
                Map.Entry<String, Integer> print = pq.poll();
                bw.write(print.getKey() + " " + print.getValue() + "\n");
            }
        }
    }
}
