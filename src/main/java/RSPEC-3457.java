import java.util.logging.Logger;
import java.util.logging.Level;

public class Example {
    private static final Logger logger = Logger.getLogger(Example.class.getName());
    
    void demonstrateFormatIssues() {
        String.format("Too many arguments %d and %d", 1, 2, 3); // Noncompliant
        String.format("First {0} and then {1}", "foo", "bar");  // Noncompliant
        
        logger.log(Level.INFO, "The number: ", 1); // Noncompliant
        logger.log(Level.INFO, "Can't load library \"{0}\"!", "foo"); // Noncompliant
    }
}
