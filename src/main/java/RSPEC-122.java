public class Example {
    public void demonstrateMultipleStatements() {
        if (someCondition) doSomething(); // Noncompliant: multiple statements on one line
        
        int x = 5; int y = 10; // Noncompliant: multiple statements on one line
        
        for (int i = 0; i < 10; i++) System.out.println(i); // Noncompliant
    }
    
    boolean someCondition = true;
    void doSomething() {}
}
