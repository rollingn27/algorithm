import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            String word = br.readLine();

            if (word.equals("NLCS")) {
                bw.write("North London Collegiate School");
            } else if(word.equals("BHA")) {
                bw.write("Branksome Hall Asia");
            } else if(word.equals("KIS")) {
                bw.write("Korea International School");
            } else {
                bw.write("St. Johnsbury Academy");
            }
        }
    }
}