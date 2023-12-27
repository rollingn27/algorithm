import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            int[] nNums = new int[n];
            Map<Integer, Integer> nNumsCount = new HashMap<>();
            String[] ns = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                nNums[i] = Integer.parseInt(ns[i]);
            }

            for (int i = 0; i < n; i++) {
                nNumsCount.put(nNums[i], nNumsCount.getOrDefault(nNums[i], 0) + 1);
            }

            Arrays.sort(nNums);
            int m = Integer.parseInt(br.readLine());
            String[] ms = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                boolean find = false;
                find = binarySearch(nNums, 0, n - 1, Integer.parseInt(ms[i]));
                if (find) {
                    bw.write(nNumsCount.get(Integer.parseInt(ms[i])) + " ");
                } else {
                    bw.write("0 ");
                }
            }
        }
    }

    public static boolean binarySearch(int[] nNums, int start, int end, int findNum) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nNums[mid] == findNum) {
                return true;
            } else if (nNums[mid] < findNum){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

}