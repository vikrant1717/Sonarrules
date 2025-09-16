import org.springframework.cache.annotation.Cacheable;

public interface ExampleService {

    @Cacheable("exampleCache") // Noncompliant
    String getData(String id);
}
