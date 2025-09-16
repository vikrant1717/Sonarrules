import java.util.stream.Stream;
import java.util.Arrays;

public class Example {
    public void demonstrateStreamReuse() {
        Stream<String> pipeline = Arrays.asList("red", "blue", "green")
                                        .stream()
                                        .filter(s -> s.length() > 3);
        
        long count1 = pipeline.count();
        long count2 = pipeline.count(); // Noncompliant: stream already consumed
    }
}
