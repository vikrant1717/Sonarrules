import java.util.regex.Pattern;

public class Example {
    public void doingSomething(String stringToMatch) {
        Pattern regex = Pattern.compile("myRegex");  // Noncompliant
        
        if (stringToMatch.matches("myRegex2")) {  // Noncompliant
            // ...
        }
    }
}
