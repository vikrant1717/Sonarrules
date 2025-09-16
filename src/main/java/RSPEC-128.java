public class Example {
    public void demonstrateFallthrough(int myVariable) {
        switch (myVariable) {
          case 1:
            foo();
            break;
          case 2:  // Both 'doSomething()' and 'doSomethingElse()' will be executed. Is it on purpose ?
            doSomething(); // Noncompliant: missing break
          default:
            doSomethingElse();
            break;
        }
    }
    
    void foo() {}
    void doSomething() {}
    void doSomethingElse() {}
}
