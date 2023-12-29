import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n, max;
        double sum = 0.0;
        n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] score = new int[n];
        for(int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        
        max = score[0];
        for(int i = 0; i < n; i++) {
            if(max < score[i])
                max = score[i];
        }
        
        for(int i = 0; i < n; i++) {
            sum += (double)score[i] / max * 100;
        }
        
        bw.write(String.valueOf(sum / n));
        bw.flush();
        bw.close();
        br.close();     
        
    }
}