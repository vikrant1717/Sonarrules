import java.io.*;

public class Example {
    public void demonstrateTryWithResources() {
        try (ByteArrayInputStream b = new ByteArrayInputStream(new byte[10]);  // ignored; this one's required
              Reader r = new InputStreamReader(b);)   // Noncompliant
        {
           //do stuff
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
