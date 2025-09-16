import org.junit.Test;

public class EmptyTest { // Noncompliant: test class with no tests
    // This class has no test methods
    
    public void nonTestMethod() {
        // This is not a test method
    }
}

public class AnotherEmptyTest extends junit.framework.TestCase { // Noncompliant: extends TestCase but no tests
    public void someMethod() {
        // Not a test method (doesn't start with 'test')
    }
}
