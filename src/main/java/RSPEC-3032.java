public class Example {
    public void loadClass() {
        ClassLoader cl = this.getClass().getClassLoader();  // Noncompliant
        
        // More examples
        ClassLoader loader = Example.class.getClassLoader(); // Noncompliant
        ClassLoader contextLoader = getClass().getClassLoader(); // Noncompliant
    }
}
