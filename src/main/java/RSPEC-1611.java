public class Example {
    public void demonstrateUnnecessaryParentheses() {
        java.util.function.Function<Integer, Integer> multiply = (x) -> x * 2; // Noncompliant
    }
}
