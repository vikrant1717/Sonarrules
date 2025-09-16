public class MyClass {
  public static final float pi = 3.14159f; // Noncompliant: Constant is not capitalized

  void myMethod() {
    System.out.println(pi);
  }
}

public enum MyEnum {
  optionOne, // Noncompliant
  optionTwo; // Noncompliant
}
