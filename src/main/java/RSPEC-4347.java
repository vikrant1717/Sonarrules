import java.security.SecureRandom;

public class Example {
    public void demonstrateInsecureSeeding() {
        SecureRandom sr = new SecureRandom();
        sr.setSeed(123456L); // Noncompliant
        int v = sr.next(32);
        
        try {
            SecureRandom sr2 = new SecureRandom("abcdefghijklmnop".getBytes("us-ascii")); // Noncompliant
            int v2 = sr2.next(32);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
