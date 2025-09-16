public class Example {
    public void dispose() throws Throwable {
        this.finalize();                       // Noncompliant
    }
    
    public void cleanup() throws Throwable {
        super.finalize();                      // Noncompliant
    }
    
    public void release() throws Throwable {
        finalize();                           // Noncompliant
    }
}
