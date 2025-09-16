public class Example {
    public void demonstrateControlCharacters() {
        String tabInside = "A	B";  // Noncompliant: contains a tabulation character
        String zeroWidthSpaceInside = "foo​bar"; // Noncompliant: contains U+200B character
        char tab = '	'; // Noncompliant: control character in literal
        
        // More examples
        String lineBreak = "Hello
World"; // Noncompliant: contains line break
        String carriageReturn = "Text"; // Noncompliant: contains carriage return
    }
}
