import java.util.Arrays;
import java.util.Comparator;

public class Example {
    public void demonstrateLambdaTypes() {
        Person[] rosterAsArray = new Person[0];
        
        Arrays.sort(rosterAsArray,
            (a, b) -> {  // Noncompliant: should specify types
                return a.getBirthday().compareTo(b.getBirthday());
            }
        );
        
        java.util.List<String> strings = Arrays.asList("a", "b", "c");
        strings.sort((x, y) -> x.compareTo(y)); // Noncompliant: should specify types in block lambda
        
        Comparator<Person> comparator = (p1, p2) -> { // Noncompliant: missing parameter types
            return p1.getName().compareTo(p2.getName());
        };
    }
}

class Person {
    private String name;
    private java.util.Date birthday;
    
    public String getName() { return name; }
    public java.util.Date getBirthday() { return birthday; }
}
