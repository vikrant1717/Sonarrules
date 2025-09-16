import org.springframework.web.bind.annotation.*;

@Controller
public class ExampleController {
    @GetMapping(value = "/exec")
    public String executeCommand(@RequestParam("cmd") String cmd) {
        try {
            Process process = Runtime.getRuntime().exec("sh -c " + cmd); // Noncompliant: OS command injection
            return "Command executed";
        } catch (Exception e) {
            return "Error executing command";
        }
    }
}
