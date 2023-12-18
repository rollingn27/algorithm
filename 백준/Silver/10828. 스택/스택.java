import java.io.*;
import java.util.*;

public class Main {

    static class Stack {
        int size;
        List<Integer> stack;

        public Stack() {
            stack = new LinkedList<>();
        }

        public void push(int X) {
            stack.add(X);
        }

        public int pop() {

            if (empty() == 1) {
                return -1;
            }
            return stack.remove(stack.size() - 1);
        }

        public int size() {
            return stack.size();
        }

        public int empty() {
            if (stack.size() == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        public int top() {
            if (empty() == 1)
                return -1;
            return stack.get(stack.size() -1);
        }
    }
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            Stack stack = new Stack();
            for (int i = 0; i < N; i++) {
                String[] order = br.readLine().split(" ");
                String orderText = order[0];
                int outPut = -1;
                if (orderText.equals("push")) {
                    stack.push(Integer.parseInt(order[1]));
                    continue;
                } else if (orderText.equals("top")) {
                    outPut = stack.top();
                } else if (orderText.equals("size")) {
                    outPut = stack.size();
                } else if (orderText.equals("empty")) {
                    outPut = stack.empty();
                } else if (orderText.equals("pop")) {
                    outPut = stack.pop();
                }
                bw.write(Integer.toString(outPut) + "\n");
            }

        }

    }
}
