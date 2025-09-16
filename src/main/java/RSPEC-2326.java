public class Example {
    public <T> int Add(int a, int b) { // Noncompliant: <T> is unused
        return a + b;
    }
    
    public <T, U> String process(String input) { // Noncompliant: T and U are unused
        return input.toLowerCase();
    }
    
    public <K, V> void doSomething() { // Noncompliant: K and V are unused
        System.out.println("Hello");
    }
}
