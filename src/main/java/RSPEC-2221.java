public class Example {
    public void demonstrateBroadCatch() {
        try {
            // do something that might throw specific exceptions
            riskyOperation();
        } catch (Exception e) { // Noncompliant: catching Exception too broadly
            // log exception ...
            e.printStackTrace();
        }
        
        try {
            anotherRiskyOperation();
        } catch (Exception ex) { // Noncompliant: broad catch
            handleError(ex);
        }
    }
    
    void riskyOperation() throws java.io.IOException {
        // method that throws specific exception
    }
    
    void anotherRiskyOperation() throws IllegalArgumentException {
        // method that throws specific exception
    }
    
    void handleError(Exception e) {}
}
