public class MyClass {
    int count = 0;  // Noncompliant
    boolean flag = false; // Noncompliant
    String name = null; // Noncompliant
    double value = 0.0; // Noncompliant
    
    private final int finalField = 0; // Compliant - final fields are ignored
}
