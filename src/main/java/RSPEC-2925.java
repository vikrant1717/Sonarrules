import org.junit.Test;

public class AsyncTest {
    @Test
    public void testDoTheThing() throws InterruptedException {
        MyClass myClass = new MyClass();
        myClass.doTheThing();

        Thread.sleep(500);  // Noncompliant
        // assertions...
    }
    
    @Test
    public void anotherAsyncTest() throws InterruptedException {
        performAsyncOperation();
        Thread.sleep(1000); // Noncompliant
        // verify results
    }
    
    void performAsyncOperation() {}
}

class MyClass {
    void doTheThing() {}
}
