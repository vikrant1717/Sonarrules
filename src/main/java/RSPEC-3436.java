import java.util.Optional;

public class Example {
    public void demonstrateValueBasedSynchronization() {
        Optional<String> fOpt = Optional.of("test");
        synchronized (fOpt) {  // Noncompliant
            // ...
        }
    }
}
