public class Example {
    public void myMethod() {  // Noncompliant: opening brace should be on new line
        if(true) {  // Noncompliant: opening brace should be on new line
            executeTask();
        } else {  // Noncompliant: opening brace should be on new line
            doSomethingElse();
        }
        
        try {  // Noncompliant: opening brace should be on new line
            riskyOperation();
        } catch (Exception e) {  // Noncompliant: opening brace should be on new line
            handleException();
        }
    }
    
    void executeTask() {}
    void doSomethingElse() {}
    void riskyOperation() {}
    void handleException() {}
}
