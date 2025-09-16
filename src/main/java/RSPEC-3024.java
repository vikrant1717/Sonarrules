import java.util.*;

public class Example {
    public void demonstrateStringConcatInBuilder() {
        List<String> names = Arrays.asList("John", "Jane", "Bob");
        
        StringBuilder sb = new StringBuilder();
        for (String name : names) {
            sb.append("Hello : " + name); // Noncompliant
        }
        
        StringBuffer buffer = new StringBuffer();
        for (String name : names) {
            buffer.append("Greetings " + name); // Noncompliant
        }
    }
}
