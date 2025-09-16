import javax.servlet.http.*;
import java.io.IOException;
import java.util.*;

public class SessionCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Optional<Cookie> cookieOpt = Arrays.stream(request.getCookies())
                                        .filter(c -> c.getName().equals("jsessionid"))
                                        .findFirst();

        if (!cookieOpt.isPresent()) {
            String cookie = request.getParameter("cookie");
            Cookie cookieObj = new Cookie("jsessionid", cookie); // Noncompliant: assigns session cookie from untrusted data
            response.addCookie(cookieObj);
        }

        response.sendRedirect("/welcome.jsp");
    }
}
