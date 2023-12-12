import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fatherColors = sc.nextLine();
        String motherColor = sc.nextLine();

        String[] fc = fatherColors.split(" ");
        String[] mc = motherColor.split(" ");
        List<String> colorList = new ArrayList<>();
        colorList.add(fc[0]);
        colorList.add(fc[1]);
        colorList.add(mc[0]);
        colorList.add(mc[1]);

        Set<String> colorSet = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String temp = colorList.get(i) + " " + colorList.get(j);
                colorSet.add(temp);
            }
        }

        String[] ans = colorSet.toArray(new String[0]);

        Arrays.sort(ans);
        for(String a: ans) {
            System.out.println(a);
        }
    }
}