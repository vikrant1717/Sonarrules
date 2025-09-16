import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @ResponseBody // Noncompliant, redundant with @RestController
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}

@RestController
@ResponseBody // Noncompliant, redundant with @RestController
class AnotherController {
    @RequestMapping("/greet")
    public String greet() {
        return "Greetings!";
    }
}
