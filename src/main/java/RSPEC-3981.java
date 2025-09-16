import java.util.*;

public class Example {
    public void demonstrateRedundantSizeChecks() {
        List<String> myList = Arrays.asList("a", "b", "c");
        String[] myArray = {"x", "y", "z"};
        
        if (myList.size() >= 0) { // Noncompliant: always true
            System.out.println("List has elements");
        }
        
        boolean result = myArray.length >= 0; // Noncompliant: always true
        
        if (myList.size() < 0) { // Noncompliant: always false
            System.out.println("This will never print");
        }
    }
}
