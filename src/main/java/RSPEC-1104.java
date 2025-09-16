public class Example {
    public static final int SOME_CONSTANT = 0;     // Compliant - constants are not checked
    
    public String firstName;                       // Noncompliant: should be private with getter/setter
    public int age;                               // Noncompliant: should be private with getter/setter
    public boolean isActive;                      // Noncompliant: should be private with getter/setter
    public Object data;                           // Noncompliant: should be private with getter/setter
    
    // Examples of other non-compliant public fields
    public String lastName;                       // Noncompliant
    public double salary;                         // Noncompliant
    public String[] hobbies;                      // Noncompliant
}
