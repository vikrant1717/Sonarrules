public class Example {
    public void demonstrateMissingElse(int x) {
        if (x == 0) { // Noncompliant: missing final else
          doSomething();
        } else if (x == 1) {
          doSomethingElse();
        }
        // missing else clause
    }
    
    void doSomething() {}
    void doSomethingElse() {}
}
