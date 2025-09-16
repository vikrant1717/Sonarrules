public class Example {
    public static void main(String [] args) {
        System.runFinalizersOnExit(true);  // Noncompliant
        Runtime.getRuntime().runFinalizersOnExit(true); // Noncompliant
    }

    protected void finalize(){
        doShutdownOperations();
    }
    
    void doShutdownOperations() {}
}
