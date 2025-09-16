public class Example {
    public void demonstrateMissingCurlyBraces() {
        if (condition)  // Noncompliant: missing curly braces
          executeSomething();
          checkSomething(); // This looks like it's part of the if, but it's not
        
        while (anotherCondition) // Noncompliant: missing curly braces
          doSomething();
          
        for (int i = 0; i < 10; i++) // Noncompliant: missing curly braces
          process(i);
    }
    
    boolean condition = true;
    boolean anotherCondition = true;
    void executeSomething() {}
    void checkSomething() {}
    void doSomething() {}
    void process(int i) {}
}
