import java.io.File;
import java.nio.file.Path;

public class Example {
    public void cleanUp(Path path) {
        File file = path.toFile();
        if (!file.delete()) {  // Noncompliant
            // handle failure
        }
    }
}
