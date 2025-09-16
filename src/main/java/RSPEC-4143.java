import java.util.*;

public class Example {
    public void demonstrateDeadStore() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // Noncompliant: overwrites without reading
        
        String[] towns = new String[10];
        int i = 0;
        towns[i] = "London";
        towns[i] = "Chicago";  // Noncompliant: overwrites without reading
    }
}
