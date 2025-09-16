public class MyClass {
    private static String foo_bar; // Noncompliant
    private static int my_count; // Noncompliant
    private static boolean IS_ACTIVE; // Noncompliant
    
    private static final String CONSTANT = "value"; // Compliant - final fields are ignored
}
