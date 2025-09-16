import java.util.Random;

public class Example {
    public void doSomething(String str) {
        if (Math.abs(str.hashCode()) > 0) { // Noncompliant
            // ...
        }
        
        Random random = new Random();
        int value = Math.abs(random.nextInt()); // Noncompliant
        
        // More examples
        if (Math.abs("test".hashCode()) != 0) { // Noncompliant
            System.out.println("Non-zero hash");
        }
    }
}
