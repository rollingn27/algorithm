import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            List<Integer> numsList = new ArrayList<>();
            for (int i = 1; i < 10000; i++) {
                numsList.add(i);
            }            
            for (int i = 1; i < 10000; i++) {
                int count = 0;
                int num = i;
                String str = String.valueOf(num);                
                int sum = i;
                for (int j = 0; j < str.length(); j++) {
                    sum += (str.charAt(j) - '0');
                }                
                numsList.remove(Integer.valueOf(sum));                
            }            
            
            for (int i : numsList) {
                bw.write(Integer.toString(i) + "\n");                                          
            }            
        }        
    }
}
