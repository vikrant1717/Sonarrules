import java.util.*;

public class Example {
    public void demonstrateAssertSideEffect() {
        List<String> myList = new ArrayList<>();
        myList.add("first");
        
        assert myList.remove(myList.get(0));  // Noncompliant
        
        // More examples
        assert performExpensiveOperation(); // Noncompliant
        assert updateDatabase("value"); // Noncompliant
    }
    
    boolean performExpensiveOperation() { return true; }
    boolean updateDatabase(String value) { return true; }
}
