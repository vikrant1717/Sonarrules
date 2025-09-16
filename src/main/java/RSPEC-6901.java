public class Example {
    public void runVirtualThread() {
        Thread t = Thread.ofVirtual().unstarted(() -> {/* some task */});
        t.setPriority(1); // Noncompliant; virtual threads' priority cannot be changed
        t.setDaemon(false); // Noncompliant; will throw IllegalArgumentException
        t.setDaemon(true); // Noncompliant; redundant
        t.start();
        var threadGroup = t.getThreadGroup(); // Noncompliant; virtual thread groups should not be used
    }
}
