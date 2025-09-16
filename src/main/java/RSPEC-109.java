public class Example {
    public static void doSomething() {
        for (int i = 0; i < 4; i++) {  // Noncompliant: 4 is a magic number
            process();
        }
        
        // More examples of magic numbers
        if (age > 18) {  // Noncompliant: 18 is a magic number
            allowAccess();
        }
        
        int[] array = new int[100];  // Noncompliant: 100 is a magic number
        
        double tax = price * 0.15;  // Noncompliant: 0.15 is a magic number
        
        Thread.sleep(5000);  // Noncompliant: 5000 is a magic number
        
        // Acceptable numbers (not magic)
        int count = 0;  // Compliant: 0 is not considered magic
        int increment = 1;  // Compliant: 1 is not considered magic
        int errorCode = -1;  // Compliant: -1 is not considered magic
    }
    
    void process() {}
    void allowAccess() {}
    int age = 25;
    double price = 100.0;
}
