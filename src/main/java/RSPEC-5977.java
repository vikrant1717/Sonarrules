import java.util.Random;
import java.util.UUID;

class Example {
    void test() {
        int userAge = new Random().nextInt(42);  // Noncompliant
        UUID userID = UUID.randomUUID(); // Noncompliant
    }
}
