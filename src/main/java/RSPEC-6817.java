import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.Async;

@EnableAsync
@Configuration
public class MyConfiguration {
    @Async // Noncompliant - not allowed in @Configuration class
    public void asyncMethod() {
        // ...
    }
}
