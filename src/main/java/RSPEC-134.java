public class Example {
    public void demonstrateDeepNesting() {
        if (condition1) {                  // Compliant - depth = 1
          /* ... */
          if (condition2) {                // Compliant - depth = 2
            /* ... */
            for (int i = 0; i < 10; i++) {  // Compliant - depth = 3
              /* ... */
              if (condition4) {            // Noncompliant - depth = 4, which exceeds the limit
                if (condition5) {          // Depth = 5, exceeding the limit
                  /* ... */
                }
                return;
              }
            }
          }
        }
    }
    
    boolean condition1 = true;
    boolean condition2 = true;
    boolean condition4 = true;
    boolean condition5 = true;
}
