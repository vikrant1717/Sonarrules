public class Parent {
    public void foo() { 
        System.out.println("Parent foo");
    }
}

public class Outer {
    public void foo() { 
        System.out.println("Outer foo");
    }

    public class Inner extends Parent {
        public void doSomething() {
            foo();  // Noncompliant: ambiguous method call - could be Parent.foo() or Outer.foo()
        }
    }
}
