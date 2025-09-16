public interface MyFace {
    void doSomething();
}

public interface MyOtherFace extends MyFace {
    void doSomethingElse();
}

public class Foo
    extends Object // Noncompliant
    implements MyFace, MyOtherFace {  // Noncompliant
    
    public void doSomething() {
        // implementation
    }
    
    public void doSomethingElse() {
        // implementation
    }
}
