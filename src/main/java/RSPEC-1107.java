public class Example {
    public void myMethod() {
        if(true) {
            executeTask();
        } else if (false) {
            doSomethingElse();
        }
        else {                               // Noncompliant: should be } else {
            generateError();
        }

        try {
            generateOrder();
        } catch (Exception e) {
            log(e);
        }
        finally {                            // Noncompliant: should be } finally {
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
