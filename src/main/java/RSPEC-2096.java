public class Example {
    public static void main(String args[]) throws Exception { // Noncompliant
        doSomething();
    }
    
    static void doSomething() throws Exception {
        throw new Exception("Something went wrong");
    }
}
