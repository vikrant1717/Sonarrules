import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.net.URL;
import java.net.HttpURLConnection;

public class UserController {
    @GetMapping("/user")
    public String getUser(@RequestParam(value = "id") String id) {
        try {
            URL url = new URL("http://example.com/api/user/" + id); // Noncompliant
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // ...
        } catch (Exception e) {
            return "error";
        }
        return "ok";
    }
}
