import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> people = new ArrayList<>();
        int one = sc.nextInt();        

        for (int i = 0; i < N - 1; i++) {
            people.add(sc.nextInt());
        }

        Collections.sort(people, Collections.reverseOrder());

        if (N == 1 || one > people.get(0)) {
            System.out.println(0);
            return;
        }

        int ans = 0;

        for (int i = 0; i < 100; i++) {
            one++;
            ans++;
            people.set(0, people.get(0) - 1);
            Collections.sort(people, Collections.reverseOrder());            
            if (one > people.get(0)) {
                break;
            }                        
        }

        System.out.println(ans);

    }
}