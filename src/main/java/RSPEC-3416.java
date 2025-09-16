import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClass {
    private final static Logger LOG = LoggerFactory.getLogger(WrongClass.class);  // Noncompliant; multiple classes using same logger
    
    public void doSomething() {
        LOG.info("Doing something");
    }
}

class WrongClass {
    // Another class
}
