import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            long[] goods = new long[N];
            String[] gStr = br.readLine().split(" ");
            for (int i = 0; i < N; i++) {
                goods[i] = Long.parseLong(gStr[i]);
            }
            Arrays.sort(goods);
            long count = 0;
            if (N == 1) {
                bw.write(String.valueOf(count));
            } else {
                for (int i = 0; i < N; i++) {
                    int left = 0;
                    int right = N - 1;
                    while (left < right) {
                        if (goods[left] + goods[right] == goods[i]) {
                            if (left != i && right != i) {
                                count++;
                                break;    
                            }                            
                            if (left == i)
                                left++;
                            if (right == i)
                                right--;                            
                        } else if (goods[left] + goods[right] < goods[i]) {
                            left++;
                        } else {
                            right--;
                        }
                    }
                }
                bw.write(String.valueOf(count));
            }
        }
    }
}