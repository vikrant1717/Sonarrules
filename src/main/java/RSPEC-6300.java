import java.nio.file.Files;
import java.nio.file.Path;
import java.io.FileOutputStream;
import java.io.FileWriter;

class Example {
    void storeSensitiveData(byte[] content, Path path, String file) throws Exception {
        Files.write(path, content); // Sensitive: unencrypted file write
        FileOutputStream out = new FileOutputStream(file); // Sensitive: unencrypted file write
        FileWriter fw = new FileWriter("outfilename", false); // Sensitive: unencrypted file write
    }
}
