public class Example {
    public void blockingOperation() {
        new Thread(() -> {
            try {
                Thread.sleep(1000); // Noncompliant blocking operation in platform thread
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }
}
