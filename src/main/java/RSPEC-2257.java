import java.security.MessageDigest;

public class MyCryptographicAlgorithm extends MessageDigest { // Noncompliant: custom MessageDigest implementation
    protected MyCryptographicAlgorithm(String algorithm) {
        super(algorithm);
    }

    @Override
    protected void engineUpdate(byte input) {
        // custom implementation
    }

    @Override
    protected void engineUpdate(byte[] input, int offset, int len) {
        // custom implementation
    }

    @Override
    protected byte[] engineDigest() {
        return new byte[0]; // custom implementation
    }

    @Override
    protected void engineReset() {
        // custom implementation
    }
}
