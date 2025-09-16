public class Example {
    private Object obj = new Object();
    
    public void performSomeAction() {
        synchronized(obj) {
            if (!suitableCondition()) {
                try {
                    obj.wait(); // Noncompliant: wait() not in loop
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            // Perform some logic
        }
    }
    
    public void anotherAction() {
        synchronized(this) {
            if (!ready()) {
                try {
                    this.wait(1000); // Noncompliant: wait() not in loop
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    
    boolean suitableCondition() { return true; }
    boolean ready() { return false; }
}
