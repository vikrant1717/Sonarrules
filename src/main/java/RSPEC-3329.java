import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.NoSuchPaddingException;

public class Example {
    public void encrypt(String key, String plainText) {
        byte[] RandomBytes = "7cVgr5cbdCZVw5WY".getBytes(StandardCharsets.UTF_8); // Noncompliant: hardcoded IV

        IvParameterSpec iv = new IvParameterSpec(RandomBytes);
        SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES");

        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv);
        } catch(NoSuchAlgorithmException|InvalidKeyException|
                NoSuchPaddingException|InvalidAlgorithmParameterException e) {
            // ...
        }
    }
}
