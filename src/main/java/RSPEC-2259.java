public class Example {
    public void method(Object input) {
        if (input == null) {
            // ...
        }
        System.out.println(input.toString()); // Noncompliant: potential NPE
    }
    
    public void paint(Color color) {
        if (color == null) {
            System.out.println("Unable to apply color " + color.toString());  // Noncompliant: NPE will be thrown
            return;
        }
    }
    
    public void process(String str) {
        String result = null;
        if (someCondition()) {
            result = "value";
        }
        System.out.println(result.length()); // Noncompliant: result might be null
    }
    
    boolean someCondition() { return false; }
}

class Color {}
