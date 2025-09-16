import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyClass {
    public void doSomething() {
        Lock lock = new ReentrantLock();
        lock.lock(); // Noncompliant: not released on all paths
        if (isInitialized()) {
            // ...
            lock.unlock();
        }
        // lock not released if !isInitialized()
    }
    
    public void anotherMethod() {
        Lock anotherLock = new ReentrantLock();
        try {
            anotherLock.lock(); // Noncompliant: lock acquired but may not be released
            if (someCondition()) {
                return; // early return without unlock
            }
            process();
        } finally {
            anotherLock.unlock(); // only unlocked in finally
        }
    }
    
    boolean isInitialized() { return true; }
    boolean someCondition() { return false; }
    void process() {}
}
