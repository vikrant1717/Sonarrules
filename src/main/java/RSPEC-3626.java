public class Example {
    boolean condition1 = true;
    boolean condition2 = false;
    
    public void foo() {
        while (condition1) {
            if (condition2) {
                continue; // Noncompliant
            } else {
                doTheThing();
            }
        }
        return; // Noncompliant; this is a void method
    }
    
    void doTheThing() {}
}
