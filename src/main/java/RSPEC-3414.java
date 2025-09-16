// This file is in a production package but contains test classes
import org.junit.Test;

public class ProductionClassTest {  // Noncompliant: test class in production code
    @Test
    public void testSomething() {
        // test implementation
    }
}

public class ProductionClass {
    public void businessLogic() {
        // production code
    }
}
