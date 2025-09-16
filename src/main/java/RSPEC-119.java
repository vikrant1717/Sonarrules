public class MyClass<TYPE> { // Noncompliant: type parameter should be single letter
  <ELEMENT> void method(ELEMENT t) { // Noncompliant: type parameter should be single letter
  }
  
  public <ReturnType> ReturnType process() { // Noncompliant: type parameter should be single letter
    return null;
  }
}
