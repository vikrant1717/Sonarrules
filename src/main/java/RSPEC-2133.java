public class Example {
    public void demonstrateUnnecessaryObjectCreation() {
        MyObject myOb = new MyObject();  // Noncompliant
        Class c = myOb.getClass();
        
        String str = new String("test"); // For getting String class
        Class strClass = str.getClass(); // Noncompliant
    }
}

class MyObject {
    // class implementation
}
