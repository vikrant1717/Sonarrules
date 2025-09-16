public class MyClass {
    String _ = "";            // Noncompliant: using underscore as identifier
    
    public void method(String _) { // Noncompliant: using underscore as parameter name
        String _ = "value";         // Noncompliant: using underscore as local variable
    }
}
