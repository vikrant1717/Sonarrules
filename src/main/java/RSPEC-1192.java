public class Example {
    public void run() {
      prepare("action1");                              // Noncompliant - "action1" is duplicated 3 times
      execute("action1");
      release("action1");
    }
    
    public String printInQuotes(String a, String b) {
      return "'" + a + "'" + b + "'";               // Compliant - literal "'" has less than 5 characters
    }
    
    void prepare(String action) {}
    void execute(String action) {}
    void release(String action) {}
}
