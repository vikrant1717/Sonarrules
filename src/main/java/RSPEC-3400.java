public class Example {
    int getBestNumber() {
        return 12;  // Noncompliant
    }
    
    String getConstantValue() {
        return "CONSTANT";  // Noncompliant
    }
    
    final double getPi() {
        return 3.14159;  // Noncompliant
    }
}
