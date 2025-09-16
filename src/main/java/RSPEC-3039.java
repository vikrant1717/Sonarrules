public class Example {
    public void demonstrateStringIndexIssues() {
        String speech = "Lorem ipsum dolor sit amet";

        String substr1 = speech.substring(-1, speech.length()); // Noncompliant, -1 is out of bounds
        String substr2 = speech.substring(speech.length(), 0);  // Noncompliant, the beginIndex must be smaller than or equal to the endIndex
        char ch = speech.charAt(speech.length());               // Noncompliant, speech.length() is out of bounds
        
        // More examples
        String text = "Hello";
        char firstChar = text.charAt(-1); // Noncompliant
        String sub = text.substring(10, 15); // Noncompliant: start index too large
    }
}
