import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    String userName; // Noncompliant: mutable instance field in servlet
    private int requestCount; // Noncompliant: mutable instance field
    private Object data; // Noncompliant: mutable instance field

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        userName = req.getParameter("userName"); // Different threads may write concurrently
        requestCount++;
        resp.getOutputStream().print(getGreeting());
    }

    public String getGreeting() { // Unpredictable value in field userName
        return "Hello " + userName + "!";
    }
}
