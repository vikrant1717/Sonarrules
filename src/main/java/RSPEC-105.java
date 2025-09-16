public class Example {
    // Noncompliant: using tabs for indentation
    public void method1() {
        if (condition) {
            doSomething();
        }
    }
    
    // Noncompliant: mixed tabs and spaces
    public void method2() {
        String value = "test";	// tab used here
        processValue(value);
    }
    
    // Noncompliant: tabs in method body
    public void method3() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    
    void doSomething() {}
    void processValue(String value) {}
    boolean condition = true;
}
