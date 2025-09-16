import java.io.IOException;

void foo() throws MyException, MyException {}  // Noncompliant; should be listed once
void bar() throws Throwable, Exception {}  // Noncompliant; Exception is a subclass of Throwable
void boo() throws IOException { // Noncompliant; IOException cannot be thrown
  System.out.println("Hi!");
}

class MyException extends Exception {}
