import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringBuilder sb = new StringBuilder();
            sb.append("#  # #### #### #  #\n");
            sb.append("#### #  # #  # # #\n");
            sb.append("#### #  # #  # # #\n");
            sb.append("#  # #### #### #  #\n");
            bw.write(sb.toString());
        }
    }
}