import java.util.Enumeration;

public class MyClass implements Enumeration {  // Noncompliant
  /* ... */
  public boolean hasMoreElements() { return false; }
  public Object nextElement() { return null; }
}
