import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        RabinKarp rabinKarp = new RabinKarp();
        KMP kmp = new KMP();
        long startTime = System.nanoTime();
        System.out.println(rabinKarp.search("ADF", "ABCDCBDCBDACBDABDCBADF" ));
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed );
        System.out.println("--------------------------------------------------------");
        kmp.KMPSearch("ADF", "ABCDCBDCBDACBDABDCBADF");
    }

    public static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }
}
