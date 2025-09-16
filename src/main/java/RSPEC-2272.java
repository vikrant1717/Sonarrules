import java.util.*;

public class MyIterator implements Iterator<String> {
    private List<String> items = Arrays.asList("a", "b", "c");
    private int index = 0;
    
    @Override
    public boolean hasNext() {
        return index < items.size();
    }
    
    @Override
    public String next() {
        if (!hasNext()) {
            return null; // Noncompliant: should throw NoSuchElementException
        }
        return items.get(index++);
    }
}

class AnotherIterator implements Iterator<Integer> {
    private int current = 0;
    private int max = 5;
    
    @Override
    public boolean hasNext() {
        return current < max;
    }
    
    @Override
    public Integer next() {
        if (current >= max) {
            return -1; // Noncompliant: should throw NoSuchElementException
        }
        return current++;
    }
}
