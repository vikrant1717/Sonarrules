import javax.servlet.http.*;
import java.io.IOException;
import java.net.*;

public class ExampleServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        InetAddress addr = InetAddress.getByName(request.getRemoteAddr()); // Noncompliant
        // servlet implementation
    }
}
