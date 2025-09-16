import java.util.*;

public class Example {
    public void demonstrateDoubleBraceInitialization() {
        Map<String, String> source = new HashMap<String, String>() {{ // Noncompliant
            put("firstName", "John");
            put("lastName", "Smith");
        }};
    }
}
