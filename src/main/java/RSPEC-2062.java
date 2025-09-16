import java.io.*;

public class Fruit implements Serializable {
  private static final long serialVersionUID = 1;

  private Object readResolve() throws ObjectStreamException { // Noncompliant, readResolve should not be private
    return this;
  }
}

public class Raspberry extends Fruit implements Serializable { // This class has no access to the parent's "readResolve" method
  // ...
}
