public class Example {
    public boolean getFoo() { // Noncompliant
        return true;
    }

    public boolean getBar(Bar c) { // Noncompliant
        return false;
    }

    public boolean testForBar(Bar c) { // Compliant - The method does not start by 'get'.
        return true;
    }
}

class Bar {}
