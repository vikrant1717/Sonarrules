import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {
    @Autowired 
    private DataSource dataSource;  // Noncompliant

    @Bean
    public MyService myService() {
        return new MyService(this.dataSource);
    }
}

class DataSource {}
class MyService {
    MyService(DataSource dataSource) {}
}
