public class Example {
    public void demonstrateLocaleIssues() {
        String myString = "Hello World";
        myString.toLowerCase(); // Noncompliant: no locale specified
        myString.toUpperCase(); // Noncompliant: no locale specified
        
        String.format("%d", 42); // Noncompliant: no locale specified
    }
}
