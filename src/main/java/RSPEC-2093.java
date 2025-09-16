import java.io.*;

public class Example {
    private String fileName = "example.txt";
    
    public void readFile() throws IOException {
        FileReader fr = null;
        BufferedReader br = null;

        try { // Noncompliant, the FileReader and BufferedReader are instantiated without try-with-resources
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
    }
}
