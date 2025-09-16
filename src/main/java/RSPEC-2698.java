import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class MessagelessAssertionTest {
    @Test
    public void testList() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        
        Assert.assertEquals(4, list.size());  // Noncompliant

        try {
            Assert.fail();  // Noncompliant
        } catch (Exception e) {
            org.assertj.core.api.Assertions.assertThat(list.get(0)).isEqualTo("pear");  // Noncompliant
        }
    }
}
