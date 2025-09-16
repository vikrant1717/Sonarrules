import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

public class Example {
    public void doTheThing() {
        // ...
        actuallyDoTheThing(); // Noncompliant: call from non-transactional to transactional
    }

    @Transactional
    public void actuallyDoTheThing() {
        // ...
    }
    
    @Transactional
    public void anotherMethod() {
        // ...
        requiresNewMethod(); // Noncompliant: call from REQUIRED to REQUIRES_NEW
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewMethod() {
        // ...
    }
}
