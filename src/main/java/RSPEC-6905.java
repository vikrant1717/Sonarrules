import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.math.BigDecimal;
import java.util.List;

public class OrderRepository {
    public record OrderSummary(String name, String orderId, BigDecimal price) { }

    public List<OrderSummary> queryOrderSummaries(Connection conn) {
        String sql = "SELECT * " + // Noncompliant
                     "FROM Orders JOIN Customers ON Orders.customerId = Customers.id ";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return convertResultToOrderSummaryList(rs);
        } catch (Exception e) {
            return null;
        }
    }

    private List<OrderSummary> convertResultToOrderSummaryList(ResultSet rs) {
        return null;
    }
}
