import java.util.stream.Stream;
import java.util.Arrays;

public class Example {
    public void demonstrateUnnecessaryStreamOperations() {
        boolean hasRed = Arrays.asList("red", "blue", "green")
                               .stream()
                               .filter(color -> "red".equals(color))
                               .findFirst()
                               .isPresent(); // Noncompliant: should use anyMatch
    }
}
