import java.util.*;

public class Example {
    public void doSomethingWithMap(Map<String,Object> map) {
        for (String key : map.keySet()) {  // Noncompliant; for each key the value is retrieved
            Object value = map.get(key);
            // ...
            System.out.println(key + "=" + value);
        }
    }
    
    public void anotherMethod(Map<Integer, String> data) {
        for (Integer id : data.keySet()) { // Noncompliant
            String name = data.get(id);
            processEntry(id, name);
        }
    }
    
    void processEntry(Integer id, String name) {}
}
