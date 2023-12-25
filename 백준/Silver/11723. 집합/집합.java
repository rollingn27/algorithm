import java.io.*;
import java.util.*;

class Main {

    static class customSet {
        Set<Integer> set;
        Set<Integer> allSet;

        public customSet() {
            set = new HashSet<>();
            allSet = new HashSet<>();
            for (int i = 1; i <= 20; i++) {
                allSet.add(i);
            }
        }

        public void add(int x) {
            set.add(x);
        }

        public void remove(int x) {
            set.remove(x);
        }

        public int check(int x) {
            return set.contains(x) ? 1 : 0;
        }

        public void toggle(int x) {
            if (set.contains(x))
                set.remove(x);
            else
                set.add(x);
        }

        public void all() {
            set = new HashSet<>(this.allSet);
        }

        public void empty() {
            set.clear();
        }
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            customSet set = new customSet();
            int M = Integer.parseInt(br.readLine());

            for (int i = 0; i < M; i++) {
                String[] command = br.readLine().split(" ");
                int x = 0;
                if (command.length > 1) {
                    x = Integer.parseInt(command[1]);
                }

                switch (command[0]) {
                    case "all":
                        set.all();
                        break;
                    case "empty":
                        set.empty();
                        break;
                    case "add":
                        set.add(x);
                        break;
                    case "check":
                        bw.write(Integer.toString(set.check(x)) + "\n");
                        break;
                    case "toggle":
                        set.toggle(x);
                        break;
                    case "remove":
                        set.remove(x);
                        break;
                }
            }
            bw.flush(); // 버퍼 비우기
        }
    }
}
