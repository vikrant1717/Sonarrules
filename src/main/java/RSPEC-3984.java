public class Example {
    public void demonstrateUnusedThrowable(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // Noncompliant
        }
    }
}
