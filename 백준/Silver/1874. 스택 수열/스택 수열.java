import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(br.readLine());
            int[] nums = new int[n];
            Deque<Integer> stack = new ArrayDeque<>();
            int stackCount = 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(br.readLine());
                if (stack.isEmpty() || stack.peek() < nums[i]) {
                    while (stackCount <= nums[i]) {
                        stack.push(stackCount);
                        sb.append("+\n");
                        stackCount++;
                    }
                }
                if (stack.peek() <= nums[i]) {
                    stack.pop();
                    sb.append("-\n");
                }

                if (!stack.isEmpty() && stack.peek() > nums[i])
                    break;
            }
            if (stack.isEmpty()) {
                bw.write(sb.toString());
            } else {
                bw.write("NO");
            }
        }
    }
}
