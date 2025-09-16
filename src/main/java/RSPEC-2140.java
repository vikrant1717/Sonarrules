import java.util.Random;

public class Example {
    public void demonstrateIneffectiveRandomInt() {
        Random r = new Random();
        int rand = (int) (r.nextDouble() * 50);  // Noncompliant way to get a pseudo-random value between 0 and 50
        int rand2 = (int) r.nextFloat(); // Noncompliant; will always be 0;
        
        int rand3 = (int) (r.nextFloat() * 100); // Noncompliant
    }
}
