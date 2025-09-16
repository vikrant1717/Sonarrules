import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {
    private static final Logger LOGGER = Logger.getLogger(Example.class.getName());
    
    public void run () {
        try {
            riskyOperation();
        } catch (InterruptedException e) { // Noncompliant; logging is not enough
            LOGGER.log(Level.WARNING, "Interrupted!", e);
        }
        
        try {
            anotherRiskyOperation();
        } catch (ThreadDeath e) { // Noncompliant; just logging, not re-throwing
            LOGGER.log(Level.WARNING, "Thread death!", e);
        }
    }
    
    void riskyOperation() throws InterruptedException {}
    void anotherRiskyOperation() throws ThreadDeath {}
}
