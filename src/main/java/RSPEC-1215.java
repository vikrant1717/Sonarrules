public class Example {
    public void demonstrateManualGC() {
        System.gc(); // Noncompliant: manual garbage collection
        Runtime.getRuntime().gc(); // Noncompliant: manual garbage collection
        System.runFinalization(); // Noncompliant: manual finalization
    }
}
