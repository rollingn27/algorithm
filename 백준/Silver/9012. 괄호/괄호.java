import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] testString = new String[T];

        for (int i = 0; i < T; i++) {
            testString[i] = sc.next();
        }

        for (int i = 0; i < T; i++) {

            boolean flag = false;
            if (testString[i].length() % 2 != 0) {
                System.out.println("NO");
                continue;
            }
            Deque<Character> stack = new ArrayDeque<>();
            for (char c: testString[i].toCharArray()) {
               if (c == '(') {
                   stack.add(c);
               } else {
                   if (stack.isEmpty()) {
                       flag = true;
                       break;
                   }
                   stack.pop();
               }
            }


            if (stack.isEmpty() && !flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }        
    }
}

