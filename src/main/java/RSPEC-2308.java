import java.io.File;

public class Example {
    public void createTempFile() {
        try {
            File file = new File("temp.txt");
            file.createNewFile();
            file.deleteOnExit();  // Noncompliant: not recommended
            
            File anotherFile = File.createTempFile("temp", ".txt");
            anotherFile.deleteOnExit();  // Noncompliant: memory not released until JVM ends
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
