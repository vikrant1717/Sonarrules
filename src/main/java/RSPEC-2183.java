public class Example {
    public int shift(int a) {
        int x = a >> 32; // Noncompliant
        return a << 48;  // Noncompliant
    }
    
    public long shiftLong(long b) {
        long y = b >> 64; // Noncompliant
        return b << 65;   // Noncompliant
    }
}
