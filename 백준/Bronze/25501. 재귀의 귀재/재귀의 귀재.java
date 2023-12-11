import java.util.*;

class Main {
    
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] checkString = new String[T];
        for (int i = 0; i < T; i++) {
            checkString[i] = sc.next();
        }
        
        for (int i = 0; i < T; i++) {
            count = 0;
            int ans = recursion(checkString[i], 0, checkString[i].length() - 1);
            System.out.printf("%d %d\n", ans, count);
        }
    }
    
    public static int recursion(String s, int left, int right) {
        count++;
        if (left >= right) return 1;
        else if (s.charAt(left) != s.charAt(right)) {
            return 0;
        }
        else {
            return recursion(s, left + 1, right - 1);
        }
    }
}