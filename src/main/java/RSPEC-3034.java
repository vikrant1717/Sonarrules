import java.math.BigInteger;

public class Example {
    public static void main(String[] args) {
        byte[] bytes12 = BigInteger.valueOf(12).toByteArray(); // This byte array will be simply [12]
        System.out.println(intFromBuffer(bytes12)); // In this case, the bytes promotion will not cause any issues, and "12" will be printed.

        // Here the bytes will be [2, -128] since 640 in binary is represented as 0b0000_0010_1000_0000
        // which is equivalent to the concatenation of 2 bytes: 0b0000_0010 = 2, and 0b1000_0000 = -128
        byte[] bytes640 = BigInteger.valueOf(640).toByteArray();

        // In this case, the shifting operation combined with the bitwise OR, will produce the wrong binary string and "-128" will be printed.
        System.out.println(intFromBuffer(bytes640));
    }

    static int intFromBuffer(byte[] bytes) {
        int originalInt = 0;
        for (int i = 0; i < bytes.length; i++) {
            // Here the right operand of the bitwise OR, which is a byte, will be promoted to an `int`
            // and if its value was negative, the added ones in front of the binary string will alter the value of the `originalInt`
            originalInt = (originalInt << 8) | bytes[i]; // Noncompliant
        }
        return originalInt;
    }
}
