import javax.servlet.http.HttpServletRequest;

public class Example {
    public void processRequest(HttpServletRequest request) {
        String sessionId = request.getRequestedSessionId(); // Noncompliant: client-supplied session ID
        
        if (isActiveSession(sessionId)) {
            // ...
        }
        
        // Another example
        String clientSessionId = request.getRequestedSessionId(); // Noncompliant: unsafe to use
        authenticateUser(clientSessionId);
    }
    
    boolean isActiveSession(String sessionId) {
        return true; // dummy implementation
    }
    
    void authenticateUser(String sessionId) {
        // authentication logic
    }
}
