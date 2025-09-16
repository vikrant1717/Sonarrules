import java.io.*;

public class ResourceExample {
    public void processFile(String fileName) {
        FileInputStream fis = null; // Noncompliant: resource opened but not properly closed
        try {
            fis = new FileInputStream(fileName);
            // process file
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Missing finally block to close resource
    }
}
