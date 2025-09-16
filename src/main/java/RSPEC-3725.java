import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public void checkFile() {
        Path myPath = Paths.get("example.txt");
        if (Files.exists(myPath)) {  // Noncompliant
            // do something
        }
    }
}
