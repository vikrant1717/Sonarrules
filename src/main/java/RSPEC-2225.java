import java.util.Collection;
import java.util.ArrayList;

public class Example {
    private Collection<String> collection = new ArrayList<>();
    
    public String toString() {
        if (this.collection.isEmpty()) {
            return null; // Noncompliant: toString() should not return null
        } else {
            return collection.toString();
        }
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        if (someCondition()) {
            return null; // Noncompliant: clone() should not return null
        }
        return super.clone();
    }
    
    boolean someCondition() { return false; }
}
