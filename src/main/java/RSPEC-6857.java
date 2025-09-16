import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public class Example {
    @Value("#{systemProperties['user.region'}") // Noncompliant: unclosed "["
    private String region;

    @Value("#{'${listOfValues}' split(',')}") // Noncompliant: missing operator
    private List<String> valuesList;

    @Value("#{T(java.lang.Math).random() * 64h}") // Noncompliant: invalid number
    private Double randPercent;

    @Query("SELECT u FROM User u WHERE u.status = :#{#status+}") // Noncompliant: missing operand for "+"
    List<User> findUsersByStatus(@Param("status") String status);

    @Value("${myapp.!prop}") // Noncompliant: property key contains an exclamation mark "!"
    private String myProperty;

    @Value("${my.property:#{1**1}}") // Noncompliant: invalid SpEL expression "1**1"
    private Integer myValue;

    static class User {}
}
