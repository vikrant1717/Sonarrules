public class Example {
    public void demonstrateUnnecessaryBooleanInversion() {
        int a = 5;
        int i = 15;
        
        if ( !(a == 2)) { // Noncompliant
            System.out.println("a is not 2");
        }
        boolean b = !(i < 10);  // Noncompliant
    }
}
