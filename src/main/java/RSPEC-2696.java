public class MyClass {
    private static int count = 0;

    public void doSomething() {
        //...
        count++;  // Noncompliant
    }
    
    public void anotherMethod() {
        count = 10; // Noncompliant
        count += 5; // Noncompliant
    }
}
