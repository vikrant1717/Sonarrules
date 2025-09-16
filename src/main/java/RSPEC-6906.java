public class Example {
    void enqueue() {
        Thread.startVirtualThread(() -> { // Noncompliant; use a platform thread instead
            setupOperations();
            dequeLogic();
        });
    }

    void enqueue2() {
        Thread.startVirtualThread(() -> { // Noncompliant; use a platform thread instead
            if (someCondition) {
                synchronizedMethod();
            } else {
                defaultLogic();
            }
        });
    }

    synchronized void synchronizedMethod() {}
    void defaultLogic() {}
    void setupOperations() {}
    void dequeLogic() {}
    boolean someCondition;
}
