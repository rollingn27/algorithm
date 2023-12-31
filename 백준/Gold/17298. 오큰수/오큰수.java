import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            String[] Ns = br.readLine().split(" ");
            int[] nums = new int[N];
            int[] ans = new int[N];
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                nums[i] = Integer.parseInt(Ns[i]);
            }
            stack.add(0);
            for (int i = 1; i < N; i++) {
                while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                    ans[stack.pop()] = nums[i];
                }
                stack.push(i);
            }
            while(!stack.isEmpty()) {
                ans[stack.pop()] = -1;
            }
            for (int i = 0; i < N; i++) {
                bw.write(String.valueOf(ans[i]) + " ");
            }
        }
    }
}
