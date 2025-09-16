import java.util.*;

private static final int KNOWN_CAPACITY = 1_000_000;

public static Map<String, Integer> buildAMap() {
    return new HashMap<>(KNOWN_CAPACITY); // Noncompliant
}

public static Set<String> buildASet() {
    return new HashSet<>(KNOWN_CAPACITY); // Noncompliant
}
