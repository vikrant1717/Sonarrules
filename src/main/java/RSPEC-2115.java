import java.sql.Connection;
import java.sql.DriverManager;

public class Example {
    public void connectToDatabase() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true", "login", ""); // Noncompliant
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
