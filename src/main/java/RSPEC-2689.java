import java.io.*;

public class Example {
    public void writeToFile(String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName, true);  // fos opened in append mode
        ObjectOutputStream out = new ObjectOutputStream(fos);  // Noncompliant
        
        out.writeObject("Hello World");
        out.close();
    }
    
    public void anotherWriteMethod(String file) throws IOException {
        FileOutputStream stream = new FileOutputStream(file, true); // append mode
        ObjectOutputStream objStream = new ObjectOutputStream(stream); // Noncompliant
    }
}
