import java.util.*;

public class Example {
    public String[] getStringArray(List<String> strings) {
        return (String[]) strings.toArray();  // Noncompliant, a ClassCastException will be thrown here
    }
    
    public Integer[] getIntegerArray(Collection<Integer> integers) {
        return (Integer[]) integers.toArray(); // Noncompliant
    }
}
