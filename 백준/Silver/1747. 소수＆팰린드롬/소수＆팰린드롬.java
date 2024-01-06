import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            int mil = 2000000;
            int[] primes = new int[mil];
            for (int i = 2; i < mil; i++) {
                primes[i] = i;
            }
            for (int i = 2; i * i < mil; i++) {
                if (primes[i] == 0)
                    continue;
                for (int j = i + i; j < mil; j = j + i) {
                    primes[j] = 0;
                }
            }            

            for (int i = 2; i < mil; i++) {
                if (primes[i] >= N && isPalindrome(primes[i])) {
                    bw.write(Integer.toString(primes[i]));
                    break;
                }
            }
        }
    }
    public static boolean isPalindrome(int n) {
        String check = String.valueOf(n);
        boolean result = true;
        for (int i = 0; i < check.length() / 2; i++) {
            if (check.charAt(i) != check.charAt(check.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }
}