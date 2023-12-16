import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 0;
        int count = 0;
        int magicNumCount = 0;
        if (N == 1) {
            System.out.println(1);
            return;
        }
        while (num < N) {
            int sixTiems = 6;
            int magicNum = 0;
            for (int i = 0; i < magicNumCount; i++) {
                magicNum += i;
            }
            sixTiems *= magicNum;
            num = 1 + sixTiems;
            magicNumCount++;
            count++;
        }

        System.out.println(count - 1);

    }
}