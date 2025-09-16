import org.junit.Assert;
import org.junit.Test;

class RunnableWithAnAssertion extends Thread {
    String expected = "expected";
    String actual = "actual";

    @Override
    public void run() {
        Assert.assertEquals(expected, actual);  // Noncompliant
    }

    @Test
    void test() {
        RunnableWithAnAssertion otherThread = new RunnableWithAnAssertion();
        otherThread.start(); // The assertion in the run method above will be executed by other thread than the current one
        // ...
        // Perform some actions that do not make the test fail
        // ...
        Assert.assertTrue(true);
    }
}
