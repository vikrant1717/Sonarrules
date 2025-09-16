public class MyThread implements Runnable {
    Object lock = new Object();

    @Override
    public void run() {
        synchronized(lock) {
            // ...
            lock.notify();  // Noncompliant: should use notifyAll()
        }
    }
    
    public void anotherMethod() {
        synchronized(lock) {
            // ...
            lock.notify();  // Noncompliant: notify() only wakes one thread
        }
    }
}
