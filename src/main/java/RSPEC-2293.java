import java.util.*;

public class Example {
    public void demonstrateDiamondOperator() {
        List<String> strings = new ArrayList<String>(); // Noncompliant: can use diamond operator
        Map<String,List<Integer>> map = new HashMap<String,List<Integer>>(); // Noncompliant: can use diamond operator
        Set<Integer> numbers = new HashSet<Integer>(); // Noncompliant: can use diamond operator
        
        // More examples
        List<Map<String, Integer>> complexList = new ArrayList<Map<String, Integer>>(); // Noncompliant
        Queue<String> queue = new LinkedList<String>(); // Noncompliant
    }
}
