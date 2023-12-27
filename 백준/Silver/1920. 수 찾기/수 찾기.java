import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int N = Integer.parseInt(br.readLine());
            String[] Ns = br.readLine().split(" ");
            int[] nNums = new int[N];


            for (int i = 0; i < Ns.length; i++) {
                nNums[i] = Integer.parseInt(Ns[i]);
            }

            Arrays.sort(nNums);
            int M = Integer.parseInt(br.readLine());
            String[] Ms = br.readLine().split(" ");
            for (int i = 0; i < M; i++) {
                boolean ans = binarySearch(nNums, 0, N - 1, Integer.parseInt(Ms[i]));
                if (ans)
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
        }
    }

    public static boolean binarySearch(int[] nNums, int start, int end, int findNum) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nNums[mid] == findNum)
                return true;
            else if (nNums[mid] < findNum) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;

    }

}