public class MyThread extends Thread { // Noncompliant
    public void doSomething() {
        System.out.println("Hello, World!");
    }
}

class AnotherThread extends Thread { // Noncompliant
    private String message;
    
    public AnotherThread(String message) {
        this.message = message;
    }
    
    public void printMessage() {
        System.out.println(message);
    }
}
