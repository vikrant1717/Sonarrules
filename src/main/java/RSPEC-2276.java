public class Example {
    private Object monitor = new Object();
    
    public void doSomething() {
        synchronized(monitor) {
            while(notReady()) {
                try {
                    Thread.sleep(200); // Noncompliant: Thread.sleep in synchronized block
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            process();
        }
    }
    
    public void anotherMethod() {
        synchronized(this) {
            if (someCondition()) {
                try {
                    Thread.sleep(1000); // Noncompliant: blocking while holding lock
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    
    boolean notReady() { return false; }
    boolean someCondition() { return true; }
    void process() {}
}
