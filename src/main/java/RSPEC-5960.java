import org.junit.Assert;

class ProductionCode {
    void doSomething() {
        Assert.assertEquals(1, 1); // Noncompliant: assertion in production code
    }
}
