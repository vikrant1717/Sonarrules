import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody // Noncompliant, should use @RestController instead
public class MyController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}

@Controller
public class AnotherController {
    @ResponseBody
    @GetMapping("/foo")
    public String foo() {
        return "Foo";
    }

    @ResponseBody
    @GetMapping("/bar")
    public String bar() {
        return "Bar";
    }
}
