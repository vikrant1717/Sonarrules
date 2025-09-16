public class Example {
    public void demonstrateIncorrectBracePlacement() {
        if(true)
        {  // Noncompliant: opening brace should be at end of previous line
            doSomething();
        }
        
        while(condition)
        {  // Noncompliant: opening brace should be at end of previous line
            process();
        }
        
        try
        {  // Noncompliant: opening brace should be at end of previous line
            riskyOperation();
        }
        catch(Exception e)
        {  // Noncompliant: opening brace should be at end of previous line
            handleError();
        }
    }
    
    void doSomething() {}
    void process() {}
    void riskyOperation() {}
    void handleError() {}
    boolean condition = true;
}
