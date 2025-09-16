import java.util.logging.Logger;
import java.util.logging.Level;
import java.text.MessageFormat;

public class Example {
    private static final Logger logger = Logger.getLogger(Example.class.getName());
    private String message = "error";
    private Object value = "test";
    
    public void demonstrateFormatIssues() {
        String.format("The value of my integer is %d", "Hello World");  // Noncompliant: String instead of int
        String.format("Duke's Birthday year is %tX", new java.util.Date());  //Noncompliant: X not supported
        String.format("Display %0$d and then %d", 1);   //Noncompliant: arguments numbered from 1
        String.format("Not enough arguments %d and %d", 1);  //Noncompliant: missing second argument
        String.format("%< is equals to %d", 2);   //Noncompliant: no previous format specifier

        MessageFormat.format("Result {1}.", value); // Noncompliant: not enough arguments
        MessageFormat.format("Result {{0}.", value); // Noncompliant: unbalanced braces
        MessageFormat.format("Result ' {0}", value); // Noncompliant: unbalanced quotes

        logger.log(Level.SEVERE, "Result {1}!", 14); // Noncompliant: not enough arguments
    }
}
