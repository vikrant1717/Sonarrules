import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;

public class Example {
    public boolean authenticate(HttpServletRequest req, DirContext ctx) throws NamingException {
        String user = req.getParameter("user");
        String filter = "(&(uid=" + user + ")(userPassword=" + req.getParameter("pass") + "))"; // Noncompliant: LDAP injection
        NamingEnumeration results = ctx.search("ou=users,dc=example,dc=com", filter, new SearchControls());
        return results.hasMore();
    }
}
