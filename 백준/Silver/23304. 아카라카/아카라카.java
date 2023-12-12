import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aka = sc.next();

        if (palindrome(aka)) {
            System.out.println("AKARAKA");
        } else {
            System.out.println("IPSELENTI");
        }
    }

    public static boolean palindrome(String aka) {
        boolean flag = true;
        if (aka.length() == 1) {
            return true;
        }

        char[] akaArray = aka.toCharArray();
        for (int i = 0; i < akaArray.length / 2; i++) {
            if (akaArray[i] != akaArray[akaArray.length - 1 - i]) {
                return false;
            }
        }
        aka = aka.substring(0, aka.length() / 2);
        return palindrome(aka);
    }
}