import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Example {
    public User getUser(Connection con, String user) throws SQLException {
        Statement stmt = con.createStatement();
        String query = "SELECT * FROM users WHERE name = '" + user + "'"; // Noncompliant: formatted SQL query
        return stmt.executeQuery(query);
    }
    
    public User getUserHibernate(org.hibernate.Session session, String data) {
        String hql = "FROM User WHERE name = '" + data + "'"; // Noncompliant: formatted HQL query
        return (User) session.createQuery(hql).uniqueResult();
    }
}

class User {}
