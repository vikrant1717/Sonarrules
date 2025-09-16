public class Example {
    public void demonstrateRepeatedUnaryOperators() {
        int i = 1;

        int j = - - -i;  // Noncompliant: equivalent to "-i"
        int k = ~~~i;    // Noncompliant: equivalent to "~i"
        int m = + +i;    // Noncompliant: equivalent to "i"

        boolean b = false;
        boolean c = !!!b;   // Noncompliant

        int x = 1;
        int y = ++ ++x;  // Noncompliant
        int z = x-- --; // Noncompliant
    }
}
