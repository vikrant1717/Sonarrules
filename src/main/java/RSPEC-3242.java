import java.util.*;

public class Example {
    public void printSize(ArrayList<Object> list) {  // Noncompliant: Collection can be used instead
        System.out.println(list.size());
    }

    public static void loop(List<Object> list) { // Noncompliant: java.lang.Iterable can be used instead
        for (Object o : list) {
            o.toString();
        }
    }
    
    public void processVector(Vector<String> vector) { // Noncompliant: List can be used instead
        for (String item : vector) {
            System.out.println(item);
        }
    }
}
