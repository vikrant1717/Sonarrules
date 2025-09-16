public class Example {
    public Boolean isUsable() {
        // ...
        return null;  // Noncompliant: Boolean method should not return null
    }

    public Boolean checkCondition() {
        if (someCondition()) {
            return true;
        }
        return null;  // Noncompliant: unexpected null return
    }

    public void caller() {
        if (isUsable()) { // A NullPointerException might occur here
            // ...
        }
    }
    
    boolean someCondition() { return false; }
}
