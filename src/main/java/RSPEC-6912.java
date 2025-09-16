import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Example {
    public void execute(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            for (int i = 0; i < 10; i++) {
                statement.execute("INSERT INTO myTable (column1, column2) VALUES (" + i + ", 'value" + i + "')"); // Noncompliant
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
