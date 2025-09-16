public class Example {
    public void demonstrateRedundantStringOperations() {
        String speech = "SonarQube is the best static code analysis tool.";

        String s1 = speech.substring(0); // Noncompliant - yields the whole string
        String s2 = speech.substring(speech.length()); // Noncompliant - yields "";
        String s3 = speech.substring(5, speech.length()); // Noncompliant - use the 1-arg version instead

        if (speech.contains(speech)) { // Noncompliant - always true
            // ...
        }
        
        if (speech.equals(speech)) { // Noncompliant - always true
            // ...
        }
        
        String replaced = speech.replace(speech, speech); // Noncompliant
    }
}
