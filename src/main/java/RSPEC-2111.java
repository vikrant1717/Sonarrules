import java.math.BigDecimal;

public class Example {
    public void demonstrateBigDecimalIssues() {
        double d = 1.1;

        BigDecimal bd1 = new BigDecimal(d);   // Noncompliant
        BigDecimal bd2 = new BigDecimal(1.1); // Noncompliant
        BigDecimal bd3 = new BigDecimal(0.1); // Noncompliant
    }
}
