import java.util.*;

public class Example {
    int getLength(String a, String b, String c) {
        List<String> strings = new ArrayList<>();  // Noncompliant: List is declared and populated but never read.
        strings.add(a);
        strings.add(b);
        strings.add(c);

        return a.length() + b.length() + c.length();
    }
}
