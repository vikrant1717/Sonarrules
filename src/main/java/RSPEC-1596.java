import java.util.*;

public class Example {
    public void demonstrateRawCollections() {
        List<String> collection1 = Collections.EMPTY_LIST;     // Noncompliant, raw List
        Set<Float> collection2 = Collections.EMPTY_SET;        // Noncompliant, raw Set
        Map<Integer, String> collection3 = Collections.EMPTY_MAP;  // Noncompliant, raw Map
    }
}
