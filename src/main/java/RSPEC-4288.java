import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorld {
    @Autowired
    private String name = null; // Noncompliant
}
