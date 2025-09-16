public class Example {
    public void demonstrateWrongThreadUsage() {
        Thread myThread = new Thread(() -> System.out.println("Hello"));
        myThread.run(); // Noncompliant, does not start a thread
        
        Thread anotherThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task");
            }
        });
        anotherThread.run(); // Noncompliant, should call start()
    }
}
