public class Example {
    public String getReadableStatus(Job j) {
        return j.isRunning() ? "Running" : j.hasErrors() ? "Failed" : "Succeeded";  // Noncompliant
    }
    
    public String getStatus(Task t) {
        return t.isActive() ? t.isCompleted() ? "Done" : "Working" : "Idle";  // Noncompliant
    }
}

class Job {
    boolean isRunning() { return false; }
    boolean hasErrors() { return true; }
}

class Task {
    boolean isActive() { return true; }
    boolean isCompleted() { return false; }
}
