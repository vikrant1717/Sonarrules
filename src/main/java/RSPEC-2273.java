public class Example {
    private Object syncValue = new Object();
    
    private void performSomeAction() {
        while (!suitableCondition()) {
            try {
                syncValue.wait(); // Noncompliant: wait() called outside synchronized block
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    public void notifyOthers() {
        syncValue.notify(); // Noncompliant: notify() called outside synchronized block
    }
    
    public void notifyAll() {
        syncValue.notifyAll(); // Noncompliant: notifyAll() called outside synchronized block
    }
    
    boolean suitableCondition() { return true; }
}
