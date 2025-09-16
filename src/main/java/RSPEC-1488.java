public class Example {
    private int hours = 2;
    private int minutes = 30;
    private int seconds = 45;
    
    public long computeDurationInMilliseconds() {
        long duration = (((hours * 60) + minutes) * 60 + seconds) * 1000; // Noncompliant
        return duration;
    }
    
    public void doSomething() {
        RuntimeException myException = new RuntimeException(); // Noncompliant
        throw myException;
    }
}
