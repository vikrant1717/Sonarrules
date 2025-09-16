import org.junit.Test;

public class EmptyTestExample {
    @Test
    public void testDoSomething() {  // Noncompliant
        MyClass myClass = new MyClass();
        myClass.doSomething();
    }
    
    @Test
    public void anotherTest() { // Noncompliant
        // no assertions
        performSomeOperation();
    }
    
    void performSomeOperation() {}
}

class MyClass {
    void doSomething() {}
}
