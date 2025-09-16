public class TopLevel {
    private class Nested { // Noncompliant: Nested is never used
        void doSomething() {
            System.out.println("Hello from nested");
        }
    }
    
    public void someMethod() {
        // Nested class is never instantiated or used
    }
}
