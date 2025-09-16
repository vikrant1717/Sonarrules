public class Example {
    public void demonstrateForLoopWithOnlyCondition() {
        boolean condition = true;
        for (;condition;) { // Noncompliant; only the condition is specified
            // loop body
            if (someCheck()) {
                condition = false;
            }
        }
    }
    
    boolean someCheck() { return Math.random() > 0.5; }
}
