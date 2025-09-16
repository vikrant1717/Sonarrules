public class Example {
    public void callTheThing() {
        doTheThing(new String[] { "s1", "s2"});  // Noncompliant: unnecessary
        doTheThing(new String[12]);  // Compliant
        doTheOtherThing(new String[8]);  // Noncompliant: ambiguous
    }

    public void doTheThing(String... args) {
        // method implementation
    }

    public void doTheOtherThing(Object... args) {
        // method implementation
    }
}
