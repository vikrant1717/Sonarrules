import java.net.URL;
import java.net.URI;
import java.util.*;

public class Example {
    public void checkUrl(URL url) throws Exception {
        Set<URL> sites = new HashSet<URL>();               // Noncompliant

        URL homepage = new URL("http://sonarsource.com");  // Compliant
        if (homepage.equals(url)) {                        // Noncompliant
            // ...
        }
        
        // Triggering hashCode on URL is also problematic
        Map<URL, String> urlMap = new HashMap<>();         // Noncompliant
    }
}
