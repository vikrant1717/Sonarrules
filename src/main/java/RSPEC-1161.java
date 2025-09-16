class ParentClass {
  public boolean doSomething(){/*...*/
    return true;
  }
}
class FirstChildClass extends ParentClass {
  public boolean doSomething(){/*...*/}  // Noncompliant
}
