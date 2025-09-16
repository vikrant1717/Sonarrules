// This class has high cognitive complexity
public class ComplexExample {
    public void complexMethod(int x, boolean flag) { // High cognitive complexity
        if (x > 0) {                    // +1
            if (flag) {                 // +2 (nested)
                for (int i = 0; i < x; i++) {  // +3 (nested)
                    if (i % 2 == 0) {   // +4 (nested)
                        try {
                            processEven(i);
                        } catch (Exception e) {  // +4 (nested)
                            if (e instanceof RuntimeException) {  // +5 (nested)
                                handleRuntimeException(e);
                            } else {
                                handleException(e);
                            }
                        }
                    } else {
                        processOdd(i);
                    }
                }
            } else if (x < 10) {        // +1
                for (int j = x; j > 0; j--) {  // +2 (nested)
                    processDecrementing(j);
                }
            }
        } else if (x == 0) {            // +1
            processZero();
        } else {
            processNegative(x);
        }
    }
    
    void processEven(int i) {}
    void processOdd(int i) {}
    void processDecrementing(int j) {}
    void processZero() {}
    void processNegative(int x) {}
    void handleRuntimeException(Exception e) {}
    void handleException(Exception e) {}
}
