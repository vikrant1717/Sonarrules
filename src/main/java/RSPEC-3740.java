import java.util.*;

public class Example {
    public void demonstrateRawTypes() {
        List list = new ArrayList(); // Noncompliant: raw type usage
        list.add("Hello World!");
        
        String item = (String) list.get(0); // Type cast needed due to raw type
        
        Map map = new HashMap(); // Noncompliant: raw type usage
        map.put("key", "value");
    }
}
