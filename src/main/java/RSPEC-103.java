public class Example {
    public void demonstrateLongLine() {
        // Noncompliant: This line is intentionally very long to demonstrate horizontal scrolling issues that reduce code readability and make it harder for developers to understand the code without scrolling horizontally
        String veryLongVariableName = "This is a very long string that extends beyond typical screen width and requires horizontal scrolling to see the complete content which reduces readability";
        
        // Noncompliant: Method call with many parameters on single line
        processData(parameter1, parameter2, parameter3, parameter4, parameter5, parameter6, parameter7, parameter8, parameter9, parameter10, parameter11, parameter12);
    }
    
    void processData(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9, Object p10, Object p11, Object p12) {
        // method implementation
    }
}
