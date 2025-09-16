public class Example {
    public void demonstrateUnnecessarySwitch(int variable) {
        switch (variable) { // Noncompliant: only 2 cases, if-else would be better
          case 0:
            doSomething();
            break;
          default:
            doSomethingElse();
            break;
        }
        
        switch (variable) { // Noncompliant: only 1 case
          case 1:
            process();
            break;
        }
    }
    
    void doSomething() {}
    void doSomethingElse() {}
    void process() {}
}
