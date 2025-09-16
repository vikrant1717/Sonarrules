public class Example {
    private volatile int[] vInts;  // Noncompliant
    private volatile MyObj myObj;  // Noncompliant
    private volatile String[] strings; // Noncompliant
    
    public void method() {
        // usage of volatile arrays and objects
    }
}

class MyObj {
    int value;
}
