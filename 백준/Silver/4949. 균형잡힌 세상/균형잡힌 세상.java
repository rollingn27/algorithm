import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String str = br.readLine();
            Map<Character, Character> braceMap = new HashMap<>();
            braceMap.put(')','(');
            braceMap.put(']','[');
            while (!".".equals(str)) {
                Deque<Character> deque = new ArrayDeque<>();
                boolean isBalance = true;
                for (char c: str.toCharArray()) {
                    if (c == '(' || c == '[')
                        deque.push(c);
                    if (c == ')' || c == ']') {
                        if (deque.isEmpty() || braceMap.get(c) != deque.pop()) {
                            isBalance = false;
                            break;
                        }
                    }
                }
                if (isBalance && deque.isEmpty())
                    bw.write("yes\n");
                else
                    bw.write("no\n");
                str= br.readLine();
            }
        }
    }
}