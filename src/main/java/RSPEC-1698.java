public class Example {
    public String getFirstName() { return "John"; }
    public String getLastName() { return "Doe"; }
    
    public void demonstrateIncorrectComparison() {
        String firstName = getFirstName(); // String overrides equals
        String lastName = getLastName();

        if (firstName == lastName) { // Noncompliant; false even if the strings have the same value
            System.out.println("Names are the same reference");
        }
    }
}
