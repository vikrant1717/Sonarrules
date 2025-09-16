import java.io.*;

public class Example {
    public void processFile(Process process) throws IOException {
        try (PrintWriter writer = new PrintWriter(process.getOutputStream())) {
            writer.write("Hello World");
            writer.flush();
            writer.close();  // Noncompliant: redundant close in try-with-resources
        }
    }
}
