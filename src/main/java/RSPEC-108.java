public class Example {
    public void demonstrateEmptyBlocks() {
        // Noncompliant: empty for loop block
        for (int i = 0; i < 42; i++){} 
        
        // Noncompliant: empty while loop block
        while (true) {}
        
        // Noncompliant: empty if block
        if (someCondition()) {}
        
        // Noncompliant: empty else block
        if (someCondition()) {
            doSomething();
        } else {}
        
        // Noncompliant: empty try block
        try {} catch (Exception e) {
            handleException(e);
        }
        
        // Noncompliant: empty catch block
        try {
            riskyOperation();
        } catch (Exception e) {}
        
        // Noncompliant: empty synchronized block
        synchronized(this) {}
    }
    
    boolean someCondition() { return true; }
    void doSomething() {}
    void handleException(Exception e) {}
    void riskyOperation() throws Exception {}
}
