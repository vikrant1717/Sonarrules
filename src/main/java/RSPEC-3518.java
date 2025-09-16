public class Example {
    boolean unknown() { return Math.random() > 0.5; }
    
    void test_divide() {
        int z = 0;
        if (unknown()) {
            z = 3;
        } else {
            // z remains 0
        }
        z = 1 / z; // Noncompliant, possible division by zero
    }
}
