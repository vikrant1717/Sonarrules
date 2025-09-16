public class Example {
    public void shouldNotBeEmpty() {  // Noncompliant - method is empty
    }

    public void notImplemented() {  // Noncompliant - method is empty
    }

    @Override
    public void emptyOnPurpose() {  // Noncompliant - method is empty
    }
}
