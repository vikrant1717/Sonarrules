import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorld {
    private String name = null; // Noncompliant: non-static member without injection annotation

    @RequestMapping("/greet")
    public String greet(String greetee) {
        if (greetee != null) {
            this.name = greetee;
        }
        return "Hello " + this.name;
    }
}
