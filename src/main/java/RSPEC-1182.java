class BaseClass {  // Noncompliant - should implement Cloneable and call super.clone()
  @Override
  public Object clone() throws CloneNotSupportedException {    // Noncompliant - should return the super.clone() instance
    return new BaseClass();
  }
}

class DerivedClass extends BaseClass implements Cloneable {
  /* Does not override clone() */

  public void sayHello() {
    System.out.println("Hello, world!");
  }
}
