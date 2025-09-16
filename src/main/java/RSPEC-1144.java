import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Foo implements Serializable
{
  public static void doSomething() {
    Foo foo = new Foo();
    // ...
  }

  private void unusedPrivateMethod() {...} // Noncompliant
  
  private void writeObject(ObjectOutputStream s) {...}  //Compliant, relates to the java serialization mechanism
  private void readObject(ObjectInputStream in) {...}  //Compliant, relates to the java serialization mechanism
}
