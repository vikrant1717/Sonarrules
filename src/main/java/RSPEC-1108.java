public class Example {
    public void myMethod() {
        if(true) {
            executeTask();
        } else if (false) {          // Noncompliant: should be on separate lines
            doSomethingElse();
        }
        else {                       // Compliant
            generateError();
        }

        try {
            generateOrder();
        } catch (Exception e) {      // Noncompliant: should be on separate lines
            log(e);
        }
        finally {                    // Noncompliant: should be on separate lines
            closeConnection();
        }
    }
    
    void executeTask() {}
    void doSomethingElse() {}
    void generateError() {}
    void generateOrder() {}
    void log(Exception e) {}
    void closeConnection() {}
}
