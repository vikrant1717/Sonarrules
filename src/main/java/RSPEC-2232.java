import java.sql.*;

public class Example {
    public void demonstrateResultSetIsLast() throws SQLException {
        Statement stmt = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT name, address FROM PERSON");
            StringBuilder sb = new StringBuilder();
            while (results.next() && !results.isLast()) { // Noncompliant: using isLast()
                sb.append(results.getString("name") + ", ");
            }
            if (!results.isLast()) { // Noncompliant: more isLast() usage
                sb.append(results.getString("name"));
            }
        } finally {
            if (stmt != null) stmt.close();
        }
    }
}
