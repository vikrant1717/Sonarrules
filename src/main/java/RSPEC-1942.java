import java.util.List;
import java.sql.Timestamp;

public class Example {
    public void demonstrateRedundantFQN() {
        java.util.List<String> myList;  // Noncompliant
        java.sql.Timestamp tStamp; // Noncompliant
    }
}
