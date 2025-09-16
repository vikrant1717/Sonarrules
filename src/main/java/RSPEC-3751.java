import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleController {
    @RequestMapping("/greet")
    private String greet(String greetee) {  // Noncompliant
        return "Hello " + greetee;
    }
}
