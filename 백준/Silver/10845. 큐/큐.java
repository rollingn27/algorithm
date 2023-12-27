import java.io.*;
import java.util.*;

class Main {

    static class CustomQueue {
        List<Integer> que;
        CustomQueue () {
            que = new LinkedList<>();
        }

        void push(int x) {
            que.add(x);
        }

        int pop() {
            if (empty() == 1)
                return -1;
            int n = que.get(0);
            que.remove(Integer.valueOf(n));
            return n;
        }

        int size() {
            return que.size();
        }

        int empty() {
            if (que.size() == 0)
                return 1;
            return 0;
        }

        int front() {
            if (empty() == 1)
                return -1;
            return que.get(0);
        }

        int back() {
            if (empty() == 1)
                return -1;
            return que.get(que.size() - 1);
        }
    }

    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            CustomQueue que = new CustomQueue();
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                String[] orders = br.readLine().split(" ");
                switch (orders[0]) {
                    case "push":
                        que.push(Integer.parseInt(orders[1]));
                        break;
                    case "front":
                        bw.write(Integer.toString(que.front()) + "\n");
                        break;
                    case "back":
                        bw.write(Integer.toString(que.back()) + "\n");
                        break;
                    case "size":
                        bw.write(Integer.toString(que.size()) + "\n");
                        break;
                    case "empty":
                        bw.write(Integer.toString(que.empty()) + "\n");
                        break;
                    case "pop":
                        bw.write(Integer.toString(que.pop()) + "\n");
                        break;
                }
            }
        }
    }

}