public class Example {
    public void demonstrateUnnecessaryParsing() {
        String myNum = "42.0";
        float myFloat = new Float(myNum);  // Noncompliant
        float myFloatValue = (new Float(myNum)).floatValue();  // Noncompliant
        int myInteger = Integer.valueOf(myNum); // Noncompliant
        int myIntegerValue = Integer.valueOf(myNum).intValue(); // Noncompliant
        
        String intString = "123";
        double doubleValue = new Double(intString); // Noncompliant
    }
}
