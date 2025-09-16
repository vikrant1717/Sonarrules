public class MyClassTest extends MyAbstractTestCase {
    private MyClass myClass;

    @Override
    protected void setUp() throws Exception {  // Noncompliant: not calling super.setUp()
        myClass = new MyClass();
    }
    
    @Override
    protected void tearDown() throws Exception { // Noncompliant: not calling super.tearDown()
        myClass = null;
    }
}

class MyAbstractTestCase {
    protected void setUp() throws Exception {
        // parent setup logic
    }
    
    protected void tearDown() throws Exception {
        // parent teardown logic
    }
}

class MyClass {
    // test class implementation
}
