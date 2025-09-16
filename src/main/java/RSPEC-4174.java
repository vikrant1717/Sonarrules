public class Example {
    public void doSomething() {
        final int local = 42; // Noncompliant: should be uppercase
        final String name = "test"; // Noncompliant: should be uppercase
    }
}
