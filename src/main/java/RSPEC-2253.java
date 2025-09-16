public class Example {
    public void demonstrateBannedMethod() {
        String name = "Hello World";
        name.replace("A","a");  // Noncompliant: banned method usage
        
        String text = "EXAMPLE TEXT";
        text.replace("EXAMPLE", "Sample"); // Noncompliant: using banned replace method
    }
}
