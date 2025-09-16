import org.junit.Assert;
import org.junit.Test;

public class TestExample {
    @Test
    public void testMethod() {
        try {
            // Some code that might throw MyException
            riskyOperation();
        } catch (MyException e) {
            Assert.fail(e.getMessage());  // Noncompliant
        }
    }
    
    void riskyOperation() throws MyException {
        throw new MyException("Something went wrong");
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
