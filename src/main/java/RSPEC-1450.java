public class Foo {
  private int a; // Noncompliant: always assigned before read
  private int b; // Noncompliant: always assigned before read

  public void doSomething(int y) {
    a = y + 5;
    // ...
    if(a == 0) {
      // ...
    }
    // ...
  }

  public void doSomethingElse(int y) {
    b = y + 3;
    // ...
  }
}
