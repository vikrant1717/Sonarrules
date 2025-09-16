import java.sql.*;

public class DatabaseExample {
    public void queryDatabase(Connection con) throws SQLException {
        PreparedStatement ps = con.prepareStatement("SELECT fname, lname FROM employees where hireDate > ? and salary < ?");
        ps.setDate(0, new java.sql.Date(System.currentTimeMillis()));  // Noncompliant
        ps.setDouble(3, 50000.0);  // Noncompliant

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String fname = rs.getString(0);  // Noncompliant
            String lname = rs.getString(3);  // Noncompliant: only 2 columns selected
        }
    }
}
