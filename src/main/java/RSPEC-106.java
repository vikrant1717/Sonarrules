public class Example {
    public void demonstrateDirectOutput() {
        // Noncompliant: direct output to System.out
        System.out.println("My Message");
        
        // Noncompliant: direct output to System.err
        System.err.println("Error occurred");
        
        // Noncompliant: using System.out.print
        System.out.print("Debug info: ");
        
        // Noncompliant: using System.err.print
        System.err.print("Warning: ");
        
        // Noncompliant: using printf
        System.out.printf("Value: %d%n", 42);
        
        // Noncompliant: error output
        System.err.printf("Error code: %d%n", 500);
    }
    
    public void processData(String input) {
        System.out.println("Processing: " + input); // Noncompliant
        
        if (input == null) {
            System.err.println("Input cannot be null"); // Noncompliant
            return;
        }
        
        System.out.println("Processing completed"); // Noncompliant
    }
}
