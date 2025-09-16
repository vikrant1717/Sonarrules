public class Example {
    private String color = "red";
    private Object data = new Object();

    private void doSomething() {
        synchronized(color) {  // Noncompliant: synchronizing on non-final field
            //...
            color = "green"; // other threads now allowed into this block
            // ...
        }
        
        synchronized(new Object()) { // Noncompliant: synchronizing on new object is no-op
             // ...
        }
        
        synchronized(data) {  // Noncompliant: synchronizing on non-final field
            processData();
        }
    }
    
    void processData() {}
}
