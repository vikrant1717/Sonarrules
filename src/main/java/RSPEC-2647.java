import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;
import java.io.IOException;

public class Example {
    public void demonstrateBasicAuth() throws IOException {
        URL url = new URL("http://api.example.com/data");
        
        String encoded = Base64.getEncoder().encodeToString("login:passwd".getBytes());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoded); // Noncompliant: basic auth
        
        // Another example
        String credentials = "user:password";
        String basicAuth = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());
        conn.setRequestProperty("Authorization", basicAuth); // Noncompliant
    }
}
