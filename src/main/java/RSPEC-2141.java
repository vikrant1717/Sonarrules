import java.util.*;

public class Student {  // no hashCode() method; not hash-able
    private String name;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }
}

public class School {
    private Map<Student, Integer> studentBody = new HashMap<Student, Integer>(); // Noncompliant

    // ...
}
