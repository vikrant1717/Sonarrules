public class Example {
    public void demonstrateNonShortCircuit() {
        if(getTrue() | getFalse()) { // Noncompliant; both sides evaluated
            doSomething();
        }
        
        if(getTrue() & getFalse()) { // Noncompliant; both sides evaluated
            doSomethingElse();
        }
        
        boolean result = getTrue() | getFalse(); // Noncompliant
    }
    
    boolean getTrue() { return true; }
    boolean getFalse() { return false; }
    void doSomething() {}
    void doSomethingElse() {}
}
