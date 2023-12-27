import java.io.*;
import java.util.*;

class Main {

    static class CustomDeque {
        List<Integer> que;
        CustomDeque () {
            que = new LinkedList<>();
        }

        void push_front(int x) {
            que.add(0, x);
        }

        void push_back(int x) {
            que.add(x);
        }

        void pop_front() {
            if (que.size() == 0) {
                System.out.println(-1);
                return;
            }

            int n = que.get(0);
            que.remove(0);
            System.out.println(n);
        }

        void pop_back() {
            if (que.size() == 0) {
                System.out.println(-1);
                return;
            }

            int n = que.get(que.size() - 1);
            que.remove(que.size() - 1);
            System.out.println(n);
        }

        void front() {
            if (que.size() == 0) {
                System.out.println(-1);
                return;
            }

            System.out.println(que.get(0));
        }

        void back() {
            if (que.size() == 0) {
                System.out.println(-1);
                return;
            }

            System.out.println(que.get(que.size() - 1));
        }
        void size() {
            System.out.println(que.size());
        }

        boolean empty() {
            if (que.size() == 0) {
                System.out.println(1);
                return true;
            }

            else {
                System.out.println(0);
                return false;
            }
        }
    }

    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            CustomDeque deque = new CustomDeque();
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                String[] orders = br.readLine().split(" ");
                switch(orders[0]) {
                    case "push_back":
                        deque.push_back(Integer.parseInt(orders[1]));
                        break;
                    case "push_front":
                        deque.push_front(Integer.parseInt(orders[1]));
                        break;
                    case "front":
                        deque.front();
                        break;
                    case "back":
                        deque.back();
                        break;
                    case "size":
                        deque.size();
                        break;
                    case "empty":
                        deque.empty();
                        break;
                    case "pop_front":
                        deque.pop_front();
                        break;
                    case "pop_back":
                        deque.pop_back();
                        break;
                }
            }
        }
    }

}