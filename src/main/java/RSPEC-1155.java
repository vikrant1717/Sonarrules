import java.util.Collection;

public class MyClass {
  public void doSomething(Collection<String> myCollection) {
    if (myCollection.size() == 0) { // Noncompliant
      doSomethingElse();
    }
  }
  
  void doSomethingElse() {}
}
