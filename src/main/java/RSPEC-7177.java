import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.annotation.DirtiesContext;

@ContextConfiguration
@DirtiesContext(methodMode = DirtiesContext.MethodMode.AFTER_METHOD) // Noncompliant, for class-level control, use classMode instead.
public class TestClass {
  @DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS) // Noncompliant, for method-level control use methodMode instead
  public void test() {
    // test logic
  }
}
