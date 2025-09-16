import java.util.concurrent.locks.Condition;

class Example {
    void doSomething(Condition condition) throws InterruptedException {
        condition.wait(); // Noncompliant, Object.wait is called
    }
}
