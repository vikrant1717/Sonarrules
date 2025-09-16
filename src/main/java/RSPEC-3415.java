import org.junit.Assert;
import org.junit.Test;

public class AssertionTest {
    @Test
    public void testRunner() {
        TestRunner runner = new TestRunner();
        
        Assert.assertEquals(runner.exitCode(), 0, "Unexpected exit code");  // Noncompliant; Yields error message like: Expected:<-1>. Actual:<0>.
        
        // AssertJ example
        org.assertj.core.api.Assertions.assertThat(0).isEqualTo(runner.exitCode()); // Noncompliant
    }
}

class TestRunner {
    public int exitCode() { return -1; }
}
