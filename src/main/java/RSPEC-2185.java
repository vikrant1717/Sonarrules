public class Example {
    public void doMath(int a) {
        double res1 = Math.floor((double)a); // Noncompliant, the result will always be equal to '(double) a'
        double res2 = Math.ceil(4.2);        // Noncompliant, the result will always be 5.0
        double res3 = Math.atan(0.0);        // Noncompliant, the result will always be 0.0
        
        // More examples
        double res4 = Math.round(42);         // Noncompliant, constant value
        double res5 = Math.abs(-5);          // Noncompliant, constant value
        double res6 = Math.sin(0.0);         // Noncompliant, the result will always be 0.0
        double res7 = Math.cos(0.0);         // Noncompliant, the result will always be 1.0
        double res8 = Math.sqrt(1.0);        // Noncompliant, the result will always be 1.0
        
        int rem = a % 1;                     // Noncompliant, always returns 0
    }
}
