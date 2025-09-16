public class Example {
    private final static String CODE = "bounteous";

    public String calculateCode() {
        doTheThing();
        return CODE;
    }

    public String getName() {  // Noncompliant: duplicates calculateCode
        doTheThing();
        return CODE;
    }
    
    void doTheThing() {}
}
