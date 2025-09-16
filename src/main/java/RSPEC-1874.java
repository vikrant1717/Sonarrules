/**
 * @deprecated  As of release 1.3, replaced by {@link #Foo}
 */
@Deprecated
public class Fum { 
    // deprecated class
}

public class Foo {
  /**
   * @deprecated  As of release 1.7, replaced by {@link #newMethod()}
   */
  @Deprecated
  public void oldMethod() { 
    // deprecated method
  }

  public void newMethod() { 
    // new method
  }
}

public class Bar extends Foo {
  public void oldMethod() { // Noncompliant; don't override a deprecated method
    // implementation
  }
}

public class Baz extends Fum {  // Noncompliant; Fum is deprecated
  public void myMethod() {
    Foo foo = new Foo();
    foo.oldMethod();  // Noncompliant; oldMethod method is deprecated
  }
}
