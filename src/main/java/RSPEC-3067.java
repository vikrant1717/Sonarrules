public class MyClass {
    public void doSomethingSynchronized() {
        synchronized (this.getClass()) {  // Noncompliant
            // ...
        }
    }
    
    public void anotherSynchronizedMethod() {
        synchronized (getClass()) { // Noncompliant
            // critical section
        }
    }
}
