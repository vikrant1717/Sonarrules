public class Name implements Comparable<Name> {
    private String firstName;
    private String lastName;
    
    public int compareTo(Name name) {
        if (firstName.compareTo(name.firstName) != 0) {
            return Integer.MIN_VALUE; // Noncompliant
        }
        if (lastName.compareTo(name.lastName) != 0) {
            return 42; // Noncompliant
        }
        return 0;
    }
}
