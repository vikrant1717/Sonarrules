import java.io.File;

public class Example {
    public void demonstrateNestedIfs(File file) {
        // Noncompliant: nested if statements that can be merged
        if (file != null) {
            if (file.isFile() || file.isDirectory()) {
                processFile(file);
            }
        }
        
        // Noncompliant: another example of mergeable conditions
        if (condition1) {
            if (condition2) {
                if (condition3) {
                    doSomething();
                }
            }
        }
        
        // Noncompliant: nested if with different conditions
        if (x > 0) {
            if (y > 0) {
                calculate();
            }
        }
    }
    
    void processFile(File file) {}
    void doSomething() {}
    void calculate() {}
    boolean condition1, condition2, condition3;
    int x, y;
}
