import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] que = new String[N];
        for (int i = 0; i < N; i++) {
            que[i] = sc.next();
        }

        int groupCount = 0;

        for (int i = 0; i < N; i++) {
            boolean countUp = true;
            List<Character> charList = new ArrayList<>();
            for (int j = 0; j < que[i].length() - 1; j++) {

                if (que[i].charAt(j) != que[i].charAt(j + 1)) {

                    if (!charList.contains(que[i].charAt(j + 1))) {
                        charList.add(que[i].charAt(j));
                    } else {
                        countUp = false;
                        break;
                    }

                } else {
                    if (charList.contains(que[i].charAt(j + 1))) {
                        countUp = false;
                        break;
                    }
                }

            }

            if (countUp)
                groupCount++;
        }
        System.out.println(groupCount);
    }
}