import java.util.concurrent.*;

public class NetworkHandler {
    void startThreadInGroup(ThreadGroup tg) { // Noncompliant, use an ExecutorService instead, which is more secure
        Thread thread = new Thread(tg, "controller");
        thread.start();
    }
    
    void createThreadGroup() {
        ThreadGroup group = new ThreadGroup("myGroup"); // Noncompliant
        Thread worker = new Thread(group, "worker");
        worker.start();
    }
}
