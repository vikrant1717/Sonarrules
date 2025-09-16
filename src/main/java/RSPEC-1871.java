public class Example {
    public void demonstrateDuplicateBlocks() {
        int a = 15;
        
        if (a >= 0 && a < 10) {
            doFirstThing();
            doTheThing();
        }
        else if (a >= 10 && a < 20) {
            doTheOtherThing();
        }
        else if (a >= 20 && a < 50) { // Noncompliant; duplicates first condition
            doFirstThing();
            doTheThing();  
        }
        else {
            doTheRest();
        }
        
        int i = 2;
        switch (i) {
            case 1:
                doFirstThing();
                doSomething();
                break;
            case 2:
                doSomethingDifferent();
                break;
            case 3:  // Noncompliant; duplicates case 1's implementation
                doFirstThing();
                doSomething();
                break;
            default:
                doTheRest();
        }
    }
    
    void doFirstThing() {}
    void doTheThing() {}
    void doTheOtherThing() {}
    void doTheRest() {}
    void doSomething() {}
    void doSomethingDifferent() {}
}
