import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String skill = sc.next();

        Deque<Character> stack = new ArrayDeque<>();
        Deque<Character> stack1 = new ArrayDeque<>();
        int count = 0;
        for (char c: skill.toCharArray()) {
            if (c == 'L') {
                stack.push(c);
            } else if (c == 'S') {
                stack1.push(c);
            } else if (c == 'R') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    count++;
                } else {

                    break;
                }
            } else if (c == 'K') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                    count++;
                } else {

                    break;
                }
            } else {
                count++;
            }
        }

        System.out.println(count);
    }
}