import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class MyComponent {

    @Value("${my.app.prop}")
    private static SomeDependency dependency; // Noncompliant
}

class SomeDependency {}
