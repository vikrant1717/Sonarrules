import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class MyComponent {
    private final MyService myService;

    @Autowired
    public MyComponent(MyService myService) {
        this.myService = myService;
    }

    @Autowired // Noncompliant
    public MyComponent(MyService myService, Integer i) {
        this.myService = myService;
    }

    @Autowired // Noncompliant
    public MyComponent(MyService myService, Integer i, String s) {
        this.myService = myService;
    }
}

class MyService {}
