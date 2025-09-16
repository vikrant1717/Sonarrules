import java.util.*;

public class Example {
    public void demonstrateIndexOfIssues() {
        String name = "ishmael";

        if (name.indexOf("ish") > 0) { // Noncompliant
            // ...
        }
        
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        if (list.indexOf("apple") > 0) { // Noncompliant: skips first element
            System.out.println("Found apple not at beginning");
        }
        
        String text = "hello world";
        if (text.indexOf("hello") > 0) { // Noncompliant: will never be true
            System.out.println("This won't print");
        }
    }
}
