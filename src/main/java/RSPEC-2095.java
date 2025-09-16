import java.io.*;

public class Example {
    private String fileName = "example.txt";
    private String[] propertyList = {"prop1", "prop2"};
    
    private void readTheFile() throws IOException {
        Path path = Paths.get(this.fileName);
        BufferedReader reader = Files.newBufferedReader(path, this.charset);
        // ...
        reader.close();  // Noncompliant
        // ...
        Files.lines("input.txt").forEach(System.out::println); // Noncompliant: The stream needs to be closed
    }

    private void doSomething() {
        OutputStream stream = null;
        try {
            for (String property : propertyList) {
                stream = new FileOutputStream("myfile.txt");  // Noncompliant
                // ...
            }
        } catch (Exception e) {
            // ...
        } finally {
            if (stream != null) {
                try {
                    stream.close();  // Multiple streams were opened. Only the last is closed.
                } catch (IOException e) {
                    // handle exception
                }
            }
        }
    }
}
