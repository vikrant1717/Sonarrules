public class Example {
    int myPow(int num, int exponent) {
        num = num * myPow(num, exponent - 1); // Noncompliant: unconditional recursion
        return num;  // this is never reached
    }
    
    void recursiveMethod(int n) {
        System.out.println(n);
        recursiveMethod(n + 1); // Noncompliant: infinite recursion
    }
    
    int factorial(int n) {
        return n * factorial(n - 1); // Noncompliant: no base case
    }
}
