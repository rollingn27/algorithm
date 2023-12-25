import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            List<Integer> numsList = new ArrayList<>();
            for (int i = 1; i < 10000; i++) {
                numsList.add(i);
            }

            List<Integer> sumList = new ArrayList<>();
            for (int i = 1; i < 10000; i++) {
                int count = 0;
                int num = i;
                String str = String.valueOf(num);
                while (num / 10 > 0) {
                    num /= 10;
                    count++;
                }

                int sum = i;

                for (int j = 0; j <= count; j++) {
                    sum += (str.charAt(j) - '0');
                }

                sumList.add(sum);
            }

            numsList.removeAll(sumList);
            for (int i : numsList) {
                bw.write(Integer.toString(i) + "\n");
            }
        }        

    }

}
