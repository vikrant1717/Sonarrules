import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

@Configuration
public class BeanConfig {
    @Bean(name = "MyBean") // Noncompliant: should start with lowercase
    public MyBean myBean() {
        return new MyBean();
    }
}

@Service("my_service") // Noncompliant: should be camelCase
class MyService {
    // ...
}

class MyBean {}
