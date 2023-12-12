import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String A = sc.nextLine();
        String[] names = A.split(" ");

        Map<String, Integer> namesMap = new HashMap<>();
        for (String name: names) {
            namesMap.put(name, 0);
        }

        for (int i = 0; i < n; i++) {
            String love = sc.nextLine();
            String[] loves = love.split(" ");
            for(String l: loves) {
                namesMap.put(l, namesMap.get(l) + 1);
            }
        }

        Comparator<Map.Entry<String, Integer>> customComparator = (entry1, entry2) -> {
            int valueCompare = entry2.getValue().compareTo(entry1.getValue());

            return (valueCompare == 0) ? entry1.getKey().compareTo(entry2.getKey()) : valueCompare;
        };

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(customComparator);
        pq.addAll(namesMap.entrySet());

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }    
}

