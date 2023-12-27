import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = Integer.parseInt(br.readLine());
            }
            if (N == 1) {
                bw.write(Integer.toString(nums[0]) + "\n");
                bw.write(Integer.toString(nums[0]) + "\n");
                bw.write(Integer.toString(nums[0]) + "\n");
                bw.write("0" + "\n");
            } else {
                Arrays.sort(nums);
                int sum = 0;
                Map<Integer, Integer> count = new HashMap<>();
                for (int i = 0; i < N; i++) {
                    sum += nums[i];
                    count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
                }

                PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> {
                    return b.getValue() - a.getValue() == 0 ? a.getKey() - b.getKey() : b.getValue() - a.getValue();
                });

                pq.addAll(count.entrySet());
                Map.Entry<Integer, Integer> pq1 = pq.poll();
                Map.Entry<Integer, Integer> pq2 = pq.poll();
                int max = pq1.getValue() == pq2.getValue() ? pq2.getKey() : pq1.getKey();

                int avg = Math.round((float) sum / N);
                int mid = N / 2;

                int range = nums[N - 1] - nums[0];
                bw.write(Integer.toString(avg) + "\n");
                bw.write(Integer.toString(nums[mid]) + "\n");
                bw.write(Integer.toString(max) + "\n");
                bw.write(Integer.toString(range) + "\n");
            }

        }
    }
}