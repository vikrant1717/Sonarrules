import java.util.*;

public class Example {
    void removeFromMap(Map<Integer, Object> map, String strKey) {
        map.remove(strKey); // Noncompliant, this call will remove nothing and always return 'null' because 'map' is handling only Integer keys and String cannot be cast to Integer.
    }

    void listContains(List<String> list, Integer integer) {
        if (list.contains(integer)) { // Noncompliant; always false as the list only contains Strings, not integers.
            // ...
        }
    }
    
    void mapOperations(Map<String, String> stringMap, Integer key) {
        stringMap.containsKey(key); // Noncompliant
        stringMap.get(key); // Noncompliant
        stringMap.remove(key); // Noncompliant
    }
}
