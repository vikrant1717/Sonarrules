import java.nio.file.Files;
import java.util.List;

public class Example {
    public int numberOfMinutes(int hours) {
        int seconds = 0;   // Noncompliant: "seconds" is unused
        return hours * 60;
    }
    
    record User(String name, int age) {}
    
    public String name(Object p) {
        return switch (p) {
            case User(String name, int age) -> name; // Noncompliant: "age" is unused replace it with the unnamed variable pattern (starting from Java 22)
            default -> throw new IllegalArgumentException();
        };
    }
    
    public static int count(int[] elements) {
        int count = 0;
        for (var el : elements) { // Noncompliant:  "el" is unused replace it with the unnamed variable pattern (starting from Java 22)
            count++;
        }
        return count;
    }
}
