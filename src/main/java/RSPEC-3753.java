import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("hello")  // Noncompliant: this doesn't get cleaned up
public class HelloWorld {
    @RequestMapping("/greet")
    public String greet(String greetee) {
        return "Hello " + greetee;
    }
}
