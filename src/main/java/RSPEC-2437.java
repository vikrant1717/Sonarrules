public class Example {
    public void demonstrateSillyBitOps() {
        int value = 42;
        
        int result1 = value & -1;  // Noncompliant: always returns original value
        int result2 = value ^ 0;   // Noncompliant: always returns original value  
        int result3 = value | 0;   // Noncompliant: always returns original value
        
        // More examples
        long longVal = 123L;
        long longResult1 = longVal & -1L;  // Noncompliant
        long longResult2 = longVal ^ 0L;   // Noncompliant
        long longResult3 = longVal | 0L;   // Noncompliant
    }
}
