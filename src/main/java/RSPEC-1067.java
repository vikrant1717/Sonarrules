public class Example {
    public void complexConditions() {
        // Noncompliant: expression complexity too high (4 operators > threshold of 3)
        if (((condition1 && condition2) || (condition3 && condition4)) && condition5) {
            doSomething();
        }
        
        // Noncompliant: ternary operators adding to complexity
        String result = condition1 ? (condition2 ? "value1" : "value2") : (condition3 ? "value3" : "value4");
        
        // Noncompliant: complex boolean expression
        boolean complexCheck = (a > b && c < d) || (e == f && g != h) || (i <= j && k >= l);
        
        // Noncompliant: nested ternary with multiple conditions
        int value = (x > 0 && y > 0) ? (z > 0 ? 1 : 2) : (w > 0 && v > 0 ? 3 : 4);
    }
    
    void doSomething() {}
    boolean condition1, condition2, condition3, condition4, condition5;
    int a, b, c, d, e, f, g, h, i, j, k, l, x, y, z, w, v;
}
