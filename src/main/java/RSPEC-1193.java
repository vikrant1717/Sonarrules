import java.io.IOException;

public class Example {
    public void demonstrateInstanceofInCatch() {
        try {
          /* ... */
        } catch (Exception e) {
          if(e instanceof IOException) { /* ... */ }         // Noncompliant: should use separate catch block
          if(e instanceof NullPointerException) { /* ... */ }  // Noncompliant: should use separate catch block
        }
    }
}
