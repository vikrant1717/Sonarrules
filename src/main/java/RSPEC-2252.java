public class Example {
    public void demonstrateForLoopCondition() {
        for (int i = 10; i < 0; i++) {  // Noncompliant: condition always false
            System.out.println("This will never execute");
        }
        
        for (int j = 5; j > 10; j++) {  // Noncompliant: condition always false
            System.out.println("This will also never execute");
        }
        
        for (int k = 0; k < -1; k++) {  // Noncompliant: condition always false
            doSomething();
        }
    }
    
    void doSomething() {}
}
