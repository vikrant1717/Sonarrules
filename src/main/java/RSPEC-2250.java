import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;

public class Example {
    private ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    private CopyOnWriteArrayList<String> copyList = new CopyOnWriteArrayList<>();
    private ArrayList<String> arrayList = new ArrayList<>();
    
    public void demonstrateExpensiveOperations() {
        queue.size(); // Noncompliant: O(n) operation on ConcurrentLinkedQueue
        queue.contains("test"); // Noncompliant: O(n) operation
        
        copyList.add("item"); // Noncompliant: O(n) operation on CopyOnWriteArrayList
        copyList.contains("item"); // Noncompliant: O(n) operation
        
        arrayList.contains("item"); // Noncompliant: O(n) operation on ArrayList
        arrayList.remove("item"); // Noncompliant: O(n) operation
    }
}
