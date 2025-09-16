import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {
    private static final Logger LOGGER = Logger.getLogger(Example.class.getName());
    
    public void demonstrateLogAndRethrow() {
        try {
            riskyDatabaseOperation();
        }
        catch (SQLException e) {
            String contextInfo = "Database operation failed";
            LOGGER.log(Level.SEVERE, contextInfo, e);
            throw new RuntimeException(contextInfo, e); // Noncompliant
        }
    }
    
    void riskyDatabaseOperation() throws SQLException {
        throw new SQLException("Database error");
    }
}
