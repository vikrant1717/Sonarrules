import javax.servlet.http.Cookie;

public class Example {
    private static final String COOKIENAME = "session";
    
    public void createCookie() {
        String sensitivedata = "sensitive_session_data";
        
        Cookie c = new Cookie(COOKIENAME, sensitivedata);
        c.setSecure(false);  // Sensitive: a security-sensitive cookie is created with the secure flag set to false
        
        Cookie c2 = new Cookie(COOKIENAME, sensitivedata);  // Sensitive: a security-sensitive cookie is created with the secure flag not defined (by default set to false)
    }
}
