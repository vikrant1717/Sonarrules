import java.nio.file.*;
import java.util.Set;
import java.util.HashSet;

public class Example {
    public void setPermissions(String filePath) {
        Set<PosixFilePermission> perms = new HashSet<>();
        perms.add(PosixFilePermission.OTHERS_READ);     // Noncompliant: granting permissions to others
        perms.add(PosixFilePermission.OTHERS_WRITE);    // Noncompliant: granting permissions to others
        perms.add(PosixFilePermission.OTHERS_EXECUTE);  // Noncompliant: granting permissions to others
        
        try {
            Files.setPosixFilePermissions(Paths.get(filePath), perms);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setPermissionsUsingRuntimeExec(String filePath) {
        try {
            Runtime.getRuntime().exec("chmod 777 " + filePath); // Noncompliant: 777 permissions
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void setOthersPermissionsHardCoded(String filePath) {
        try {
            Files.setPosixFilePermissions(Paths.get(filePath), PosixFilePermissions.fromString("rwxrwxrwx")); // Noncompliant: world-writable
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
