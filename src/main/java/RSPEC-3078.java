import java.util.concurrent.atomic.AtomicInteger;

public class Example {
    private volatile int count = 0;
    private volatile boolean boo = false;

    public void incrementCount() {
        count++;  // Noncompliant
    }

    public void toggleBoo() {
        boo = !boo;  // Noncompliant
    }
    
    public void decrementCount() {
        count--; // Noncompliant
    }
    
    public void addToCount(int value) {
        count += value; // Noncompliant
    }
}
