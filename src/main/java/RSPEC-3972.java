public class Example {
    boolean condition1 = true;
    boolean condition2 = false;
    
    public void demonstrateConfusingIfStatement() {
        if (condition1) {
            // do something
        } if (condition2) {  // Noncompliant
            // do something else
        }
    }
}
