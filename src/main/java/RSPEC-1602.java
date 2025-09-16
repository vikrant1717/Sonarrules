public class Example {
    public void demonstrateBlockNotation() {
        java.util.function.BinaryOperator<Integer> add = (a, b) -> { return a + b; }; // Noncompliant, replace code block with expression
        
        java.util.function.Consumer<Integer> print = x -> {System.out.println(x+1);}; // Noncompliant, replace code block with statement
    }
}
