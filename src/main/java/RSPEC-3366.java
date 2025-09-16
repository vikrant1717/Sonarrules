import java.util.*;

public class Monument {
    public static final List<Monument> ALL_MONUMENTS = new ArrayList<>();
    private String location;

    public Monument(String location) {
        ALL_MONUMENTS.add(this);  // Noncompliant; passed to a method of another object
        this.location = location;
    }
    
    public void processMonument() {
        registerWithService(this); // Noncompliant: passing this to another object
    }
    
    void registerWithService(Monument monument) {}
}
