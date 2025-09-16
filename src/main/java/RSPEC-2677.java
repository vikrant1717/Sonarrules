import java.io.*;

public class Example {
    public void doSomethingWithFile(String fileName) {
        try(BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
            while (buffReader.readLine() != null) { // Noncompliant
                // ...
            }
        } catch (IOException e) {
            // ...
        }
    }
    
    public void anotherExample(String fileName) {
        try(FileReader reader = new FileReader(fileName)) {
            reader.read(); // Noncompliant: return value ignored
        } catch (IOException e) {
            // ...
        }
    }
}
