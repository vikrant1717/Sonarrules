import java.util.logging.Logger;
import java.util.logging.Level;
import com.google.common.base.Preconditions;

public class Example {
    private static final Logger logger = Logger.getLogger(Example.class.getName());
    private String message = "error";
    private String csvPath = "/path/to/file.csv";
    private boolean condition = true;
    private int a = 5;
    
    public void demonstratePerformanceIssues() {
        logger.log(Level.DEBUG, "Something went wrong: " + message);  // Noncompliant: string concatenation
        logger.fine("An exception occurred with message: " + message); // Noncompliant
        logger.severe("Unable to open file " + csvPath); // Noncompliant
        
        Preconditions.checkState(a > 0, "Arg must be positive, but got " + a);  // Noncompliant: string concatenation
        Preconditions.checkState(condition, formatMessage());  // Noncompliant: method call
        Preconditions.checkState(condition, "message: %s", formatMessage());  // Noncompliant: method call in varargs
    }
    
    private String formatMessage() {
        return "Formatted message";
    }
}
