import sun.misc.BASE64Encoder; // Noncompliant: using sun.* package

public class Example {
    public void demonstrateSunPackageUsage() {
        BASE64Encoder encoder = new BASE64Encoder(); // Noncompliant: sun.* classes
        // ...
    }
}
