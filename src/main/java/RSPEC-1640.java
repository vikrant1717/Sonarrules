import java.util.*;

public class Example {
    public enum Color {
        RED, GREEN, BLUE, ORANGE;
    }

    Map<Color, String> colorMap = new HashMap<>(); // Noncompliant
}
