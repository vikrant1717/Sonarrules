import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public void encrypt(byte[] key, byte[] ptxt) {
    byte[] nonce = "7cVgr5cbdCZV".getBytes(); // Noncompliant: hardcoded IV

    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
    SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
    GCMParameterSpec gcmSpec = new GCMParameterSpec(128, nonce);

    cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmSpec);
}
