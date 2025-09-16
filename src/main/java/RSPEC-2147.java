import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeoutException;
import java.util.logging.Logger;

public class Example {
    Logger logger = Logger.getLogger("Example");
    
    public void demonstrateDuplicateCatch() {
        try {
            riskyOperation();
        }
        catch (IOException e) {
            doCleanup();
            logger.log(java.util.logging.Level.INFO, "IO Exception", e);
        }
        catch (SQLException e) {  // Noncompliant
            doCleanup();
            logger.log(java.util.logging.Level.INFO, "SQL Exception", e);
        }
        catch (TimeoutException e) {  // Compliant; block contents are different
            doCleanup();
            throw e;
        }
    }
    
    void riskyOperation() throws IOException, SQLException, TimeoutException {}
    void doCleanup() {}
}
