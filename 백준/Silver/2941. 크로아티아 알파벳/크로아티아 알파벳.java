import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int count = str.length();

        for (int i = 1; i < str.length(); i++) {
            if (arr[i] == 'z' && arr[i - 1] == 'd' && (i + 1) != str.length()) {
                if (arr[i + 1] == '=') {
                    count--;
                }
            } else if (arr[i] == '=' || arr[i] == '-')
                count--;
            else if (arr[i] == 'j' && (arr[i - 1] == 'l' || arr[i - 1] == 'n')) {
                count--;
            }
        }

        System.out.println(count);
    }
}