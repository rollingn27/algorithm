import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] strs = new String[N];

        for (int i = 0; i < N; i ++) {
            strs[i] = sc.next();
        }

        HashMap<String, Integer> strMap = new HashMap<>();
        for (String s: strs) {
            strMap.put(s, s.length());
        }

        Comparator<Map.Entry<String, Integer>> customComparator = (entry1, entry2) -> {
            int length = entry1.getValue().compareTo(entry2.getValue());

            return (length == 0 ) ? entry1.getKey().compareTo(entry2.getKey()) : length;
        };

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(customComparator);
        pq.addAll(strMap.entrySet());

        while(!pq.isEmpty()) {
            System.out.println(pq.poll().getKey());
        }
    }

}