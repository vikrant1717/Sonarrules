public class PrivateConstructorClass {  // Noncompliant
    private PrivateConstructorClass() {
        // ...
    }

    public static int magic() {
        return 42;
    }
}

class AnotherUtilityClass {  // Noncompliant
    private AnotherUtilityClass() {
        // private constructor
    }
    
    public static void doSomething() {
        // static method
    }
}
