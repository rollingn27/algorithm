import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringBuilder sb= new StringBuilder();
            sb.append(".  .   .\n");
            sb.append("|  | _ | _. _ ._ _  _\n");
            sb.append("|/\\|(/.|(_.(_)[ | )(/.");
            bw.write(sb.toString());
        }
    }
}
