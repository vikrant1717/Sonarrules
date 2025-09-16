import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ApiController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping(value = "/authenticate")
    @ResponseBody
    public String authenticate(
        @RequestParam("user") String user,
        @RequestParam("pass") String pass) {
        
        String query = "SELECT * FROM users WHERE user = '" + user + "' AND pass = '" + pass + "'"; // Noncompliant: SQL injection vulnerability
        
        try {
            jdbcTemplate.queryForObject(query, String.class);
        } catch (Exception e) {
            return "Unauthorized";
        }
        
        return "Authentication Success";
    }
}
