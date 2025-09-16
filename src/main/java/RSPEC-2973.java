public class Example {
    String prefix = "n\u00E9e"; // Noncompliant
    String suffix = "\u0041BC"; // Noncompliant: represents "ABC"
    String message = "Hello \u0057orld"; // Noncompliant: represents "Hello World"
    
    public void method() {
        String text = "\u0048\u0065\u006C\u006C\u006F"; // Noncompliant: represents "Hello"
    }
}
