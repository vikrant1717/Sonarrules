import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CachePut;

class Example {
    @Cacheable
    @CachePut
    void getBook(String isbn){ // Noncompliant
        // ...
    }
}
