public class Example {
    public void demonstrateNonInvariantConditions() {
        for (int i = 0; i < foo(); i++) { // Noncompliant, "foo()" is not an invariant
            // ...
        }
        
        for (int i = 0; i < list.size(); i++) { // Noncompliant, list.size() could change
            // ...
        }
        
        for (int i = 0; i < 10; i++) {
            // ...
            if (condition) i++; // Noncompliant, i is updated from within body
            // ...
        }
    }
    
    int foo() { return 10; }
    java.util.List<String> list = new java.util.ArrayList<>();
    boolean condition = true;
}
