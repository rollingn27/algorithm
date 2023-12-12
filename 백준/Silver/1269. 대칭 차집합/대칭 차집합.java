import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Set<Integer> aSet = new HashSet<>();
        Set<Integer> bSet = new HashSet<>();
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            aList.add(sc.nextInt());
        }

        for (int i = 0; i < b; i++) {
            bList.add(sc.nextInt());
        }

        aSet.addAll(aList);
        bSet.addAll(bList);
        int count = 0;

        for (int i = 0; i < b; i++) {
            if (!aSet.contains(bList.get(i))){
                count++;
            }
        }

        for (int i = 0; i < a; i++) {
            if (!bSet.contains(aList.get(i))){
                count++;
            }
        }

        System.out.println(count);


    }
}