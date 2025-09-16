import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class MyConfiguration {
    @Bean
    @Qualifier("myService")
    public MyService myService() {
        return new MyService();
    }

    @Bean
    @Qualifier("betterService")
    public MyService aBetterService() {
        return new MyService();
    }

    @Bean
    @Qualifier("evenBetterService")
    public MyService anEvenBetterService() {
        return new MyService();
    }

    @Bean
    @Qualifier("differentService")
    public MyBean aDifferentService() {
        return new MyBean();
    }
}

class MyService {}
class MyBean {}
