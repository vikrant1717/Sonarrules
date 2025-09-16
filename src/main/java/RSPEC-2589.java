public class Example {
    public void doThings(boolean b, boolean c) {
        if (b == b) {  // Noncompliant: condition always true
            doSomething();
        }
        
        if (c != c) {  // Noncompliant: condition always false
            doSomethingElse();
        }
        
        if (true && false) {  // Noncompliant: condition always false
            unreachableCode();
        }
        
        boolean alwaysTrue = true;
        if (alwaysTrue || c) {  // Noncompliant: first part always true
            doAction();
        }
    }
    
    void doSomething() {}
    void doSomethingElse() {}
    void unreachableCode() {}
    void doAction() {}
}
