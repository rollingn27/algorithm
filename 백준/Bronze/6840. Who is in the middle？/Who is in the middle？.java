import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            int result = 0;
            if (a > b) {
                if (b > c)
                    result = b;
                else
                    if (a > c)
                        result = c;
                    else {
                        result = a;
                    }
            } else {
                if (a > c)
                    result = a;
                else
                    if (b < c)
                        result = b;
                    else
                        result = c;
            }

            bw.write(Integer.toString(result));
        }
    }
}