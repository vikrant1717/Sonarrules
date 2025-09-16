import java.net.Socket;

public class Example {
    public void connectToService() {
        String ip = "192.168.12.42"; // Noncompliant: hardcoded IP address
        Socket socket = new Socket(ip, 6667);
        
        String serverIp = "10.0.0.100"; // Noncompliant: hardcoded IP address
        Socket serverSocket = new Socket(serverIp, 8080);
    }
}
