import java.io.*;

public class Watermelon implements Serializable {

  void writeObject(java.io.ObjectOutputStream out)         // Noncompliant, "writeObject" needs to be private, which it is not here
        throws IOException {
    out.defaultWriteObject();
  }

  static Object readResolve() throws ObjectStreamException { // Noncompliant, "readResolve" should not be static
    return new Watermelon();
  }

  Watermelon writeReplace() throws ObjectStreamException {   // Noncompliant, "writeReplace" must return "java.lang.Object"
    return this;
  }
}
