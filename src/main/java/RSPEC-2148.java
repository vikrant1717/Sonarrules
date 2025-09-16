public class Example {
    public void demonstrateNumericLiterals() {
        int i = 10000000;  // Noncompliant; is this 10 million or 100 million?
        int  j = 0b01101001010011011110010101011110;  // Noncompliant
        long l = 0x7fffffffffffffffL;  // Noncompliant
        
        double d = 1000000.0; // Noncompliant
        int octal = 01234567; // Noncompliant
    }
}
