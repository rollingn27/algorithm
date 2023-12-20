import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int C, N, sum, count;
        double p, av;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        C = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < C; i++) {
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int[] score = new int[N];
            sum = count = 0;                      
            
            for(int j = 0; j < N; j++) {                
                score[j] = Integer.parseInt(st.nextToken());                
            }
            
            for(int j = 0; j < N; j++)
                sum += score[j];
            
            av = (double)sum / N;
            
            for(int j = 0; j < N; j++) {
                if(av < score[j])
                    count++;
            }
            
            p = (double)count / N * 100;            
            bw.write(String.format("%.3f", p) + "%");            
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
        br.close();        
    }
}