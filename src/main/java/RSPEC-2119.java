import java.util.Random;

class MyClass {
    public void doSomethingCommon() {
        Random random = new Random();        // Noncompliant - new instance created with each invocation
        int rValue = random.nextInt();
    }
    
    public void anotherMethod() {
        Random anotherRandom = new Random(); // Noncompliant
        double dValue = anotherRandom.nextDouble();
    }
}
