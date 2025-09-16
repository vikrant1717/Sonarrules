import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;

public class Example {
    public boolean validate(HttpServletRequest request) {
        String regex = request.getParameter("regex");
        String input = "test input";
        return input.matches(regex); // Noncompliant: regex injection vulnerability
    }
    
    public boolean validatePattern(HttpServletRequest request) {
        String userRegex = request.getParameter("pattern");
        Pattern pattern = Pattern.compile(userRegex); // Noncompliant: regex injection
        return pattern.matcher("test").matches();
    }
}
