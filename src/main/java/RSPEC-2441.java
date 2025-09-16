import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

public class Address {
    // Noncompliant: Address is not Serializable
    private String street;
    private String city;
}

public class Example {
    public void storeAddress(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("address", new Address());  // Noncompliant: Address isn't serializable
        
        // More examples
        session.setAttribute("data", new Object());  // Noncompliant: Object not serializable
        session.setAttribute("list", new java.util.ArrayList<>()); // Compliant: ArrayList is serializable
    }
}
