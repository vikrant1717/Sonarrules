public class Example {
    public void demonstrateLongBitsToDouble() {
        int i = 0x80003800;
        Double.longBitsToDouble(i);   // Noncompliant - NaN
        
        short s = 0x1234;
        Double.longBitsToDouble(s);   // Noncompliant
        
        byte b = 0x12;
        Double.longBitsToDouble(b);   // Noncompliant
    }
}
