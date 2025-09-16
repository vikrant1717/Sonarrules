import java.util.Arrays;

public class Example {
    public void demonstrateArraysListStream() {
        Arrays.asList("a1", "a2", "b1", "c2", "c1").stream()
            .filter(s -> s.startsWith("a"))
            .forEach(System.out::println);

        Arrays.asList(1, 2, 3, 4).stream() // Noncompliant
            .filter(i -> i > 2)
            .forEach(System.out::println);
    }
}
