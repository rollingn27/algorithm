import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Map.Entry<Integer, Map<String, Integer>>> memberList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            Map<String, Integer> orderMap = new HashMap<>();
            orderMap.put(temp[1], i);
            Map.Entry<Integer, Map<String, Integer>> entry = new AbstractMap.SimpleEntry<>(Integer.parseInt(temp[0]), orderMap);
            memberList.add(entry);
        }

        PriorityQueue<Map.Entry<Integer, Map<String, Integer>>> pq = new PriorityQueue<>((entry1, entry2) -> {
            int val = entry1.getKey().compareTo(entry2.getKey());
            return (val == 0) ? entry1.getValue().values().iterator().next().compareTo(entry2.getValue().values().iterator().next()) : val;
        });
        pq.addAll(memberList);

        while (!pq.isEmpty()) {
            Map.Entry<Integer, Map<String, Integer>> temp = pq.poll();
            bw.write(temp.getKey() + " " + temp.getValue().keySet().iterator().next() + "\n");
        }

        bw.close();
    }
}
