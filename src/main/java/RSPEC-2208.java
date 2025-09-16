import java.util.*; // Noncompliant: wildcard import
import java.io.*; // Noncompliant: wildcard import
import java.sql.*; // Noncompliant: wildcard import

public class Example {
    private Date date; // Ambiguous: Date exists in java.util and java.sql
    private List<String> list;
    private File file;
    
    public void method() {
        // Which Date class is this referring to?
        date = new Date();
    }
}
