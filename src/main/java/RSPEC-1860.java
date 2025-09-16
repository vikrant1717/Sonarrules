import java.util.*;

public class Example {
    private static final Boolean bLock = Boolean.FALSE;
    private static final Integer iLock = Integer.valueOf(0);
    private static final String sLock = "LOCK";
    private static final List<String> listLock = List.of("a", "b", "c", "d");

    public void doSomething() {

        synchronized(bLock) {  // Noncompliant
            // critical section
        }
        synchronized(iLock) {  // Noncompliant
            // critical section
        }
        synchronized(sLock) {  // Noncompliant
            // critical section
        }
        synchronized(listLock) {  // Noncompliant
            // critical section
        }
    }
}
