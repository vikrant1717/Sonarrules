public class Example implements Runnable {
    private Thread myThread = new Thread(this);
    
    public void demonstrateThreadWaitIssues() {
        try {
            myThread.wait(); // Noncompliant: calling wait() on Thread
            
            Thread anotherThread = new Thread(() -> System.out.println("Hello"));
            anotherThread.notify(); // Noncompliant: calling notify() on Thread
            anotherThread.notifyAll(); // Noncompliant: calling notifyAll() on Thread
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    @Override
    public void run() {
        System.out.println("Running");
    }
}
