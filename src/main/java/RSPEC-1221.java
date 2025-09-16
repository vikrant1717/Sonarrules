public class Example {
    public int hashcode() { return 42; }             // Noncompliant: should be hashCode()
    public String tostring() { return "example"; }          // Noncompliant: should be toString()
    public boolean equal(Object obj) { return false; }  // Noncompliant: should be equals()
}
