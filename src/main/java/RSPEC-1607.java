import org.junit.Test;
import org.junit.Ignore;

public class ExampleTest {
    @Ignore  // Noncompliant
    @Test
    public void testDoTheThing() {
        // test implementation
    }
    
    @Test
    public void testAssumeFalse() {
        org.junit.Assume.assumeFalse(true); // Noncompliant
        // test implementation
    }
}
