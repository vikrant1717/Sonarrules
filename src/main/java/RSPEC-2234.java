public class Example {
    public double divide(int divisor, int dividend) {
        return divisor / dividend;
    }

    public void doTheThing() {
        int divisor = 15;
        int dividend = 5;

        double result = divide(dividend, divisor);  // Noncompliant: parameters swapped
        
        // Another example
        processData(getPassword(), getUsername()); // Noncompliant: if method expects (username, password)
    }
    
    public void processData(String username, String password) {
        // process with username and password
    }
    
    String getUsername() { return "user"; }
    String getPassword() { return "pass"; }
}
