public class Parent {
    synchronized void foo() {
        // parent implementation
    }
}

public class Child extends Parent {
    @Override
    public void foo() {  // Noncompliant
        // child implementation
        super.foo();
    }
}
