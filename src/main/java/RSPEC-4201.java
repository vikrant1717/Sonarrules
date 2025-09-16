public class Example {
    public void checkInstance(Object x) {
        if (x != null && x instanceof MyClass) { // Noncompliant
            // ...
        }
        
        if (x == null || !(x instanceof MyClass)) { // Noncompliant
            // ...
        }
    }
}

class MyClass {
    // Example class
}
