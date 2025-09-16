public class Example {
    public void demonstrateRedundantToString() {
        String message = "hello world";
        System.out.println(message.toString()); // Noncompliant;
    }
}
