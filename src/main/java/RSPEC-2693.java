public class MyClass {
    Thread thread = null;

    public MyClass(Runnable runnable) {
        thread = new Thread(runnable);
        thread.start(); // Noncompliant
    }
    
    public MyClass(String name) {
        Thread t = new Thread(() -> System.out.println("Hello"));
        t.start(); // Noncompliant
    }
}
