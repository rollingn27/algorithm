import java.io.*;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String testCase;
            while ((testCase = br.readLine()) != null) {
                String[] tc = testCase.split(" ");

                String str = tc[0];
                char[] chars = str.toCharArray();
                int findNum = Integer.parseInt(tc[1]);

                Arrays.sort(chars); // 입력 문자열을 정렬

                String result = getKthPermutation(chars, findNum);

                if (result != null)
                    bw.write(testCase + " = " + result + "\n");
                else {
                    bw.write(testCase + " = No permutation\n");
                }
            }
        }
    }

    // k번째 순열을 구하는 함수
    private static String getKthPermutation(char[] chars, int k) {
        int count = 0;
        do {
            count++;
            if (count == k) {
                return new String(chars);
            }
        } while (nextPermutation(chars));

        return null;
    }

    // 다음 순열을 계산하는 함수
    private static boolean nextPermutation(char[] array) {
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }

        if (i <= 0) {
            return false; // 마지막 순열
        }

        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }

        char temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        return true;
    }
}
