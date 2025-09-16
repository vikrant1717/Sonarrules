import java.util.*;

public class Example {
    public String processMap(Map<String, String> map, String key) {
        String value = map.get(key);
        if (value == null) {  // Noncompliant
            value = createValueFor(key);
            if (value != null) {
                map.put(key, value);
            }
        }
        
        if (!map.containsKey(key)) {  // Noncompliant
            value = createValueFor(key);
            if (value != null) {
                map.put(key, value);
            }
        }
        return value;
    }
    
    String createValueFor(String key) {
        return "Value for " + key;
    }
}
