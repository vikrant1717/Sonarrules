public class Example {
    boolean condition = true;
    
    public void demonstrateAmbiguousCode() {
        if (condition)  // Noncompliant
        doTheThing();
        doTheOtherThing(); // Was the intent to call this function unconditionally?
    }
    
    void doTheThing() {}
    void doTheOtherThing() {}
}
