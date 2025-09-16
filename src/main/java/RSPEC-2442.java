import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example {
    Lock lock = new ReentrantLock();
    
    public void doSomething() {
        synchronized(lock) {  // Noncompliant: synchronizing on Lock object
            // ...
        }
    }
    
    public void anotherMethod() {
        Lock myLock = new ReentrantLock();
        synchronized(myLock) {  // Noncompliant: throws away Lock's power
            process();
        }
    }
    
    void process() {}
}
