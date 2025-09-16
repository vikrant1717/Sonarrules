public class Example {
    @SuppressWarnings("unused")
    @SuppressWarnings("unchecked")  // Noncompliant
    private String field;
    
    @SuppressWarnings("deprecation") // Noncompliant if tracking "deprecation"
    public void method() {
        // method implementation
    }
}
