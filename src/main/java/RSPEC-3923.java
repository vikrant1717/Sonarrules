public class Example {
    public void demonstrateIdenticalBranches(int i, boolean b) {
        if (b == true) {  // Noncompliant
            doOneMoreThing();
        } else {
            doOneMoreThing();
        }
        
        int result = i > 12 ? 4 : 4;  // Noncompliant
        
        switch (i) {  // Noncompliant
            case 1:
                doSomething();
                break;
            case 2:
                doSomething();
                break;
            case 3:
                doSomething();
                break;
            default:
                doSomething();
        }
    }
    
    void doOneMoreThing() {}
    void doSomething() {}
}
