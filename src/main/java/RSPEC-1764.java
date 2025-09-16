public class Example {
    public void demonstrateDuplicateOperands() {
        int a = 5, b = 10;
        
        if ( a == a ) { // Noncompliant: always true
            doZ();
        }
        if ( a != a ) { // Noncompliant: always false
            doY();
        }
        if ( a == b && a == b ) { // Noncompliant: if the first one is true, the second one is too
            doX();
        }
        if ( a == b || a == b ) { // Noncompliant: if the first one is true, the second one is too
            doW();
        }

        int j = 5 / 5; // Noncompliant: always 1
        int k = 5 - 5; // Noncompliant: always 0

        String c = "test";
        c.equals(c); // Noncompliant: always true
    }
    
    void doZ() {}
    void doY() {}
    void doX() {}
    void doW() {}
}
