public class Example {
    int foo(int y) {
        int x = 100; // Noncompliant: dead store
        x = 150;     // Noncompliant: dead store
        x = 200;
        return x + y;
    }
}
