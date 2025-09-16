import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example {
    public void demonstrateHardCodedPaths() {
        // Noncompliant: hard-coded absolute path
        File userList = new File("/home/mylogin/Dev/users.txt");
        
        // Noncompliant: hard-coded Windows path
        File configFile = new File("C:\\Program Files\\MyApp\\config.properties");
        
        // Noncompliant: hard-coded URL
        String apiUrl = "https://api.example.com/v1/users";
        
        // Noncompliant: hard-coded path with multiple separators
        Path dataPath = Paths.get("/var/data/application/files/input.csv");
        
        // Noncompliant: hard-coded path delimiters
        String fullPath = "/home/user" + "/" + "documents" + "/" + "file.txt";
        
        // Noncompliant: hard-coded network path
        String networkPath = "\\\\server\\share\\folder\\file.dat";
    }
    
    public static final String LONG_PATH = "/very/long/path/with/many/segments/that/exceeds/two/parts"; // Noncompliant
    public static final String SHORT_PATH = "/user/friends"; // Compliant: relative path with only two parts
}
