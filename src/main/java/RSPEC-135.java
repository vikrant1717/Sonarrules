public class Example {
    public void demonstrateMultipleBreaksAndContinues() {
        for (int i = 1; i <= 10; i++) {     // Noncompliant; two "continue" statements
          if (i % 2 == 0) {
            continue;
          }
        
          if (i % 3 == 0) {
            continue;
          }
          // ...
        }
        
        for (int j = 0; j < 5; j++) {     // Noncompliant; two "break" statements
          if (j == 2) {
            break;
          }
          if (j == 3) {
            break;
          }
          // ...
        }
    }
}
