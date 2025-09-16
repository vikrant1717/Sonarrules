public class Example {
    private Object anObject = new Object();
    
    public void doSomething() {
        try {
            anObject.notify(); // This will throw IllegalMonitorStateException
        } catch(IllegalMonitorStateException e) { // Noncompliant: catching IllegalMonitorStateException
            // This masks the real issue
            e.printStackTrace();
        }
    }
    
    public void anotherMethod() {
        try {
            anObject.wait();
        } catch(IllegalMonitorStateException ex) { // Noncompliant: should fix synchronization instead
            // Hiding the programming error
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
