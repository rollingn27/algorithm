import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String[] SP = br.readLine().split(" ");
            String DNA = br.readLine();
            String[] ACGT = br.readLine().split(" ");
            int s = Integer.parseInt(SP[0]);
            int p = Integer.parseInt(SP[1]);
            int[] acgt = new int[4];
            for (int i = 0; i < 4; i++) {
                acgt[i] = Integer.parseInt(ACGT[i]);
            }

            int count = 0;
            int[] checkWords = new int[4];
            for (int i = 0; i < p; i++) {
                if (DNA.charAt(i) == 'A') {
                    checkWords[0]++;
                } else if (DNA.charAt(i) == 'C') {
                    checkWords[1]++;
                } else if (DNA.charAt(i) == 'G') {
                    checkWords[2]++;
                } else if (DNA.charAt(i) == 'T') {
                    checkWords[3]++;
                }
            }
            for (int i = 0; i <= s - p; i++) {
                boolean possible = true;
                for (int j = 0; j < 4; j++) {
                    if (acgt[j] > checkWords[j]) {
                        possible = false;
                    }
                }
                if (possible)
                    count++;
                if (i == s - p)
                    break;
                if (DNA.charAt(i) == 'A') {
                    checkWords[0]--;
                } else if (DNA.charAt(i) == 'C') {
                    checkWords[1]--;
                } else if (DNA.charAt(i) == 'G') {
                    checkWords[2]--;
                } else if (DNA.charAt(i) == 'T') {
                    checkWords[3]--;
                }
                if (DNA.charAt(i + p) == 'A') {
                    checkWords[0]++;
                } else if (DNA.charAt(i + p) == 'C') {
                    checkWords[1]++;
                } else if (DNA.charAt(i + p) == 'G') {
                    checkWords[2]++;
                } else if (DNA.charAt(i + p) == 'T') {
                    checkWords[3]++;
                }
            }
            bw.write(String.valueOf(count));
        }
    }
}