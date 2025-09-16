import java.util.*;

public class Example {
    public void doSomething(List<String> strings) {
        StringBuilder sb = new StringBuilder();  // Noncompliant
        sb.append("Got: ");
        for (String str : strings) {
            sb.append(str).append(", ");
            // ...
        }
    }
    
    public void anotherMethod() {
        StringBuffer buffer = new StringBuffer(); // Noncompliant
        buffer.append("Processing...");
        // buffer is never converted to string
    }
}
