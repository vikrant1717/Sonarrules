public class Example {
    private int unusedField = 42; // Noncompliant: unused private field
    private String anotherUnusedField; // Noncompliant: unused private field
    private boolean flagNotUsed = false; // Noncompliant: unused private field
    private Object objectNeverReferenced = new Object(); // Noncompliant: unused private field
    
    private int usedField = 10; // Compliant: used in method below
    
    public int compute(int a) {
        return a * usedField; // usedField is actually used
    }
    
    private static final long serialVersionUID = 1L; // Compliant: serialization exception
}

class ExampleWithAnnotation {
    @SuppressWarnings("unused")
    private int annotatedField; // Compliant: annotated field exception
}

class ExampleWithNative {
    private int fieldUsedByNative = 42; // Compliant: native method exception
    private native static void doSomethingNative();
}
