import java.sql.Connection;
import java.sql.DriverManager;

public class Example {
    private static final String PASSWORD = "hardcodedPassword123"; // Noncompliant
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb",
                "username", 
                "myHardcodedPassword" // Noncompliant
            );
        } catch (Exception e) {
            return null;
        }
    }
}
