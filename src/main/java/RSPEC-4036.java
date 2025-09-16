import java.io.IOException;

public class Example {
    public void executeCommand() {
        try {
            Runtime.getRuntime().exec("make");  // Noncompliant: command without full path
            Runtime.getRuntime().exec(new String[]{"make"});  // Noncompliant
            
            ProcessBuilder builder = new ProcessBuilder("make");  // Noncompliant
            builder.command("make");  // Noncompliant
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
