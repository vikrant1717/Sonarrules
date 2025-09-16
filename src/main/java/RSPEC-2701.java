import org.junit.Assert;
import org.junit.Test;

public class TestExample {
    @Test
    public void testMethod() {
        Assert.assertTrue(true);  // Noncompliant
        
        // AssertJ example
        org.assertj.core.api.Assertions.assertThat(null).isNull(); // Noncompliant

        Assert.assertEquals(true, something()); // Noncompliant
        Assert.assertNotEquals(null, something()); // Noncompliant
    }
    
    boolean something() { return false; }
}
