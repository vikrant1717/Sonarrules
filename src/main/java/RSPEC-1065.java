public class Example {
    void demonstrateUnusedLabels() {
        // Noncompliant: label 'outer' is declared but never used
        outer:
        for(int i = 0; i < 10; i++) {
            break; // breaks inner loop, not using the label
        }
        
        // Noncompliant: label 'loop1' is declared but never used
        loop1:
        while(true) {
            break; // breaks the while loop, not using the label
        }
        
        // Noncompliant: label 'start' is declared but never used
        start:
        if (someCondition()) {
            return;
        }
        
        // Compliant: label 'nested' is actually used
        nested:
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if (i * j > 50) {
                    break nested; // properly using the label
                }
            }
        }
    }
    
    boolean someCondition() { return true; }
}
