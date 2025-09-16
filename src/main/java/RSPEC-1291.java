public class Example {
    public void problematicMethod() {
        int unused = 42; // NOSONAR - Noncompliant: using NOSONAR marker
        System.out.println("Hello World"); // NOSONAR
    }
}
