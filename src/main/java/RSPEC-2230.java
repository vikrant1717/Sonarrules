import org.springframework.scheduling.annotation.Async;
import org.springframework.transaction.annotation.Transactional;
import java.util.concurrent.Future;

public class Example {
    @Async
    private Future<String> asyncMethodWithReturnType() { // Noncompliant: private method with @Async
        return java.util.concurrent.CompletableFuture.completedFuture("Hello, world!");
    }
    
    @Transactional
    private void transactionalMethod() { // Noncompliant: private method with @Transactional
        // method implementation
    }
    
    @Async
    protected void protectedAsyncMethod() { // Noncompliant for Spring < 6
        // method implementation
    }
}
