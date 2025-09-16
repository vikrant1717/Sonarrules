public class Example {
    public void demonstrateStringIfElse() {
        String choice = getChoice();
        
        if ("red".equals(choice)) {  // Noncompliant: should use switch for 3+ string comparisons
            dispenseRed();
        } else if ("blue".equals(choice)) {
            dispenseBlue();
        } else if ("yellow".equals(choice)) {
            dispenseYellow();
        } else {
            promptUser();
        }
        
        String action = getAction();
        if ("start".equals(action)) {  // Noncompliant: should use switch
            startProcess();
        } else if ("stop".equals(action)) {
            stopProcess();
        } else if ("pause".equals(action)) {
            pauseProcess();
        } else if ("reset".equals(action)) {
            resetProcess();
        }
    }
    
    String getChoice() { return "red"; }
    String getAction() { return "start"; }
    void dispenseRed() {}
    void dispenseBlue() {}
    void dispenseYellow() {}
    void promptUser() {}
    void startProcess() {}
    void stopProcess() {}
    void pauseProcess() {}
    void resetProcess() {}
}
