import java.io.*;

public class Example {
    private synchronized void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException { // Noncompliant
        in.defaultReadObject();
    }
    
    private synchronized void writeObject(java.io.ObjectOutputStream out) 
            throws IOException { // Noncompliant: synchronized is unnecessary
        out.defaultWriteObject();
    }
}
