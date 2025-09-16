public class Example {
    enum Day { MONDAY, TUESDAY, WEDNESDAY }
    
    public void demonstrateMixedLabels(Day day) {
        switch (day) {
          case MONDAY:
          case TUESDAY:
          WEDNESDAY:   // Noncompliant; syntactically correct, but behavior is not what's expected
            doSomething();
            break;
        }
        
        switch (day) {
          case MONDAY:
            break;
          case TUESDAY:
            foo:for(int i = 0 ; i < 10 ; i++) {  // Noncompliant; label in switch case
                 /* ... */
                break foo;
                 /* ... */
            }
            break;
        }
    }
    
    void doSomething() {}
}
