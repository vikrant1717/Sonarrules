import java.util.stream.Stream;
import java.util.Arrays;

public class Example {
    public void demonstrateUnusedStream() {
        Arrays.asList("red", "blue", "green")
              .stream()
              .filter(s -> s.length() > 3); // Noncompliant: no terminal operation
    }
}
