public class Example {
    public void demonstrateBroadCatching() {
        try { 
            riskyOperation(); 
        } catch (Throwable t) { // Noncompliant: catching Throwable
            handleError(t);
        }
        
        try { 
            anotherRiskyOperation(); 
        } catch (Error e) { // Noncompliant: catching Error
            handleError(e);
        }
    }
    
    void riskyOperation() throws Exception {}
    void anotherRiskyOperation() throws Exception {}
    void handleError(Throwable t) {}
}
