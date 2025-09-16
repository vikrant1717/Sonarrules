import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public void demonstrateStreamCollectors() {
        Stream<String> stream = Stream.of("a", "b", "c");
        long count = stream.collect(Collectors.counting());  // Noncompliant
    }
}
