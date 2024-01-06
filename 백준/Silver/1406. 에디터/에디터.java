import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str = br.readLine();
            Deque<Character> stackOri = new ArrayDeque<>();
            Deque<Character> stackMove = new ArrayDeque<>();
            for (char c: str.toCharArray()) {
                stackOri.push(c);
            }
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String coms = br.readLine();
                switch (coms.charAt(0)) {
                    case 'L':
                        if (!stackOri.isEmpty()) {
                            stackMove.push(stackOri.pop());
                        }
                        break;
                    case 'B':
                        if (!stackOri.isEmpty()) {
                            stackOri.pop();
                        }
                        break;
                    case 'D':
                        if (!stackMove.isEmpty()) {
                            stackOri.push(stackMove.pop());
                        }
                        break;
                    case 'P':
                        stackOri.push(coms.charAt(2));
                        break;
                }
            }

            while (!stackOri.isEmpty()) {
                stackMove.push(stackOri.pop());
            }
            StringBuilder sb = new StringBuilder();
            while (!stackMove.isEmpty()) {
                sb.append(stackMove.pop());
            }
            bw.write(sb.toString());
        }
    }
}