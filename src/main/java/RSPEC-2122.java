import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Example {
    public void createThreadPools() {
        int poolSize = 5; // value greater than 0

        ScheduledThreadPoolExecutor threadPool1 = new ScheduledThreadPoolExecutor(0); // Noncompliant

        ScheduledThreadPoolExecutor threadPool2 = new ScheduledThreadPoolExecutor(poolSize);
        threadPool2.setCorePoolSize(0);  // Noncompliant
    }
}
