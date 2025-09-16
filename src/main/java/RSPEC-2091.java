import javax.servlet.http.HttpServletRequest;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;

public class Example {
    public boolean authenticate(HttpServletRequest request, XPath xpath, Document doc) throws XPathExpressionException {
        String user = request.getParameter("user");
        String expression = "//users/user[@name='" + user + "']"; // Noncompliant: XPath injection
        return (Boolean)xpath.evaluate(expression, doc, XPathConstants.BOOLEAN);
    }
}
