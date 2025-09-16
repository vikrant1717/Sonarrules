public class A {
    public static int counter = 0;
}

public class B {
    private A first = new A();
    private A second = new A();

    public void runUpTheCount() {
        first.counter++;  // Noncompliant: accessing static member through instance
        second.counter++; // Noncompliant: A.counter is now 2, contrary to expectations
    }
    
    public void anotherMethod() {
        String result = first.toString(); // OK: instance method
        int count = second.counter; // Noncompliant: static access through instance
    }
}
