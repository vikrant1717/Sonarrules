public class Example {
    public static void main(String[] args) {
        Thread runnable = new Thread() {
            @Override
            public void run() { 
                System.out.println("Running in thread"); 
            }
        };
        new Thread(runnable).start();  // Noncompliant: passing Thread where Runnable expected
        
        // Another example
        Thread anotherThread = new Thread() {
            @Override
            public void run() {
                process();
            }
        };
        
        executeTask(anotherThread);  // Noncompliant: Thread used as Runnable
    }
    
    static void executeTask(Runnable task) {
        new Thread(task).start();
    }
    
    static void process() {}
}
