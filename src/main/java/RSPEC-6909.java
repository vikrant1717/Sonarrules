import java.sql.Connection;
import java.sql.PreparedStatement;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.Date;
import java.util.List;

public class DatabaseExample {
    public record Order(String id, BigDecimal price) {}

    public void updateTodayOrders(Connection connection, List<Order> orders) {
        Date today = java.sql.Date.valueOf(LocalDate.now());
        String insertQuery = "INSERT INTO Order (id, price, executionDate) VALUES (?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            for (Order order : orders) {
                preparedStatement.setString(1, order.id());
                preparedStatement.setString(2, order.price().toString());
                preparedStatement.setDate(3, today); // Noncompliant
                preparedStatement.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
