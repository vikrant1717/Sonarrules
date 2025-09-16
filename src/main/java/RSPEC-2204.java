import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

public class Example {
    public Boolean isSameNumberValue(AtomicLong a, AtomicLong b) {
        return a.equals(b); // Noncompliant: equals only true if a == b, not if values are same
    }

    public Boolean isSameReference(AtomicInteger a, AtomicInteger b) {
        return a.equals(b); // Noncompliant: misleading use of equals
    }
    
    public boolean compareAtomics(AtomicLong x, AtomicLong y) {
        return x.equals(y); // Noncompliant: object identity, not value comparison
    }
}
