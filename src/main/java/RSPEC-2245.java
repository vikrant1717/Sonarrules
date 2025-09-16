import java.util.Random;
import java.security.SecureRandom;

public class Example {
    public void demonstrateInsecureRandom() {
        Random random = new Random(); // Noncompliant: non-cryptographic PRNG
        byte[] bytes = new byte[20];
        random.nextBytes(bytes); // Used for security-sensitive context
        
        // More examples
        int sessionId = random.nextInt(); // Noncompliant: predictable session ID
        long token = random.nextLong(); // Noncompliant: predictable token
        
        // Using Math.random for security context
        double randomValue = Math.random(); // Noncompliant: non-cryptographic
        int pin = (int)(Math.random() * 10000); // Noncompliant: predictable PIN
    }
}
