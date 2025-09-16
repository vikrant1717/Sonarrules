import java.io.*;

public class Example {
    public void demonstrateDefaultEncoding() {
        FileReader reader = new FileReader("file.txt"); // Noncompliant
        FileWriter writer = new FileWriter("output.txt"); // Noncompliant
        
        String text = "Hello World";
        byte[] bytes = text.getBytes(); // Noncompliant
        
        String reconstructed = new String(bytes); // Noncompliant
    }
}
