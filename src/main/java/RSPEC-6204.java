import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

List<String> list1 = Stream.of("A", "B", "C")
                           .collect(Collectors.toList()); // Noncompliant

List<String> list2 = Stream.of("A", "B", "C")
                           .collect(Collectors.toUnmodifiableList()); // Noncompliant
