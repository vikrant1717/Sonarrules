public class MyClass {

  @Override
  protected void finalize() { // Noncompliant
    releaseSomeResources();
  }
  
  void releaseSomeResources() {}

}
