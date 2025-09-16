public class Example {
    public void demonstrateAlwaysTrueFalse() {
        boolean a = false;
        boolean b = true;
        
        if (a) { // Noncompliant: always false
            doSomething(); // never executed
        }

        if (!a || b) { // Noncompliant: "!a" is always "true", "b" is never evaluated
            doSomething();
        } else {
            doSomethingElse(); // never executed
        }
        
        int x = 0;
        if (x == 0) { // Noncompliant: always true if x is always 0
            process();
        }
    }
    
    void doSomething() {}
    void doSomethingElse() {}
    void process() {}
}
