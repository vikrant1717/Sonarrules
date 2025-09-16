import org.h2.security.SHA256;

String inputString = "s3cr37"; // Noncompliant: hardcoded secret
byte[] key         = inputString.getBytes();

SHA256.getHMAC(key, message);
