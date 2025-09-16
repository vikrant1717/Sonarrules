public class Example {
    public void checkString() {
        if ("string".length() == 0) { /* ... */ } // Noncompliant
        if ("string".length() > 0) { /* ... */ } // Noncompliant
    }

    public void checkStringBuilder() {
        StringBuilder sb = new StringBuilder();
        if (sb.length() == 0) { /* ... */ } // Noncompliant
    }
}
