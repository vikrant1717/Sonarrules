import org.springframework.scheduling.annotation.Scheduled;

public class ExampleService {

    @Scheduled(fixedRate = 5000)
    public void scheduledTask(String param) { // Noncompliant
        // Task implementation
    }
}
