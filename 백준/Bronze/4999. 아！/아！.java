import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String j = br.readLine();
            String d = br.readLine();
            if (j.length() >= d.length()) {
                bw.write("go");
            } else {
                bw.write("no");
            }
        }
    }
}