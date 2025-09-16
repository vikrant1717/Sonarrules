import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
    @RequestMapping("/delete_user")  // Noncompliant: by default all HTTP methods are allowed
    public String delete1(String username) {
        // state of the application will be changed here
        return "User deleted";
    }

    @RequestMapping(path = "/delete_user2", method = {RequestMethod.GET, RequestMethod.POST}) // Noncompliant: both safe and unsafe methods are allowed
    String delete2(@RequestParam("id") String id) {
        // state of the application will be changed here
        return "User deleted";
    }
}
