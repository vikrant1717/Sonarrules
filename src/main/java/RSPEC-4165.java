public class Example {
    public void demonstrateUselessAssignment() {
        int a, b, c;
        a = b = 5;
        c = a;
        b = c; // Noncompliant: c and b are already the same
    }
}
