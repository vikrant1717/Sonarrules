public class Example {
    public boolean isOdd(int x) {
        return x % 2 == 1;  // Noncompliant: fails for negative odd numbers
    }
    
    public boolean isEven(int x) {
        return x % 2 == 0; // Compliant: works for all integers
    }
    
    public boolean isDivisibleByThree(int x) {
        return x % 3 == 1; // Noncompliant: wrong logic, but demonstrates the issue
    }
    
    public boolean checkModulus(int value) {
        return value % 5 == -1; // Noncompliant: modulus comparison with negative
    }
}
