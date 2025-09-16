public class Example {
    public void demonstrateIncorrectClosingBrace() {
        if(true) {
            doSomething();}  // Noncompliant: closing brace should be on new line
        
        while(condition) {
            process();}      // Noncompliant: closing brace should be on new line
            
        for(int i = 0; i < 10; i++) {
            work();}         // Noncompliant: closing brace should be on new line
    }
    
    void doSomething() {}
    void process() {}
    void work() {}
    boolean condition = true;
}
