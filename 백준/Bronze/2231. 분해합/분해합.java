import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String N = br.readLine();
            int n = Integer.parseInt(N);
            String result = "0";
            for (int i = 2; i < n; i++) {
                int sum = i;
                String makeNum = String.valueOf(i);
                for (int j = 0; j < makeNum.length(); j++) {
                    sum += (makeNum.charAt(j) - '0');
                }

                if (sum == n) {
                    result = makeNum;
                    break;
                }
            }
            bw.write(result);
        }
    }

}