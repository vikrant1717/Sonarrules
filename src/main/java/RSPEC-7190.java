import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.context.transaction.BeforeTransaction;
import org.springframework.test.context.transaction.AfterTransaction;

@Transactional
public class TransactionalTest {

    @BeforeTransaction
    public String setupTransaction(int x) { // Noncompliant
        // Setup logic
        return "setup";
    }

    @AfterTransaction
    public int cleanupTransaction(int x) { // Noncompliant
        // Cleanup logic
        return x;
    }
}
