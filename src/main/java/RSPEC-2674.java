import java.io.*;

public class Example {
    public void doSomething(String fileName) {
        try {
            InputStream is = new FileInputStream(new File(fileName));
            byte[] buffer = new byte[1000];
            is.read(buffer);  // Noncompliant: return value not checked
            
            // More examples
            is.skip(50);  // Noncompliant: return value not checked
            
            BufferedInputStream bis = new BufferedInputStream(is);
            bis.read(buffer);  // Noncompliant: return value not checked
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
