import java.io.*;

public class Example {
    public String readFile(File f) throws IOException {
        String content;
        try {
            content = readFromDisk(f);
        } catch (IOException e) {
            throw e; // Noncompliant: just rethrowing
        }
        return content;
    }
    
    String readFirstLine(FileReader fileReader) throws IOException {
        try (BufferedReader br = new BufferedReader(fileReader)) {
            return br.readLine();
        } catch (IOException e) { // Noncompliant
            throw e;
        }
    }
    
    String readFromDisk(File file) throws IOException {
        return "content";
    }
}
