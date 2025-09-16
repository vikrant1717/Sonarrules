import javax.crypto.spec.PBEParameterSpec;

public class Example {
    public void hash() {
        byte[] salt = "salty".getBytes();
        PBEParameterSpec cipherSpec = new PBEParameterSpec(salt, 10000); // Noncompliant
    }
}
