import org.springframework.http.*;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    public ResponseEntity<User> getUserById(Long userId) {
        try {
            User user = userService.getUserById(userId);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(user); // Noncompliant: Setting 500 for a successful operation
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.OK).build(); // Noncompliant: Setting 200 for exception
        }
    }
    UserService userService;
    static class User {}
    static class UserService {
        User getUserById(Long id) { return new User(); }
    }
}
