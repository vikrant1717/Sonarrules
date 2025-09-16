import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope("prototype")  // Noncompliant
@Controller
public class HelloWorld {
    public String greet() {
        return "Hello";
    }
}
