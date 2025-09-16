public void myMethod1() throws Exception {
  // ...
  throw new Exception("message");   // Noncompliant
  // ...
}

public void myMethod2() throws Exception {  // Compliant; propagation allowed
  myMethod1();
}

class CheckedException extends Exception {
    CheckedException(String message) { super(message); }
}
