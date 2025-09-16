import java.lang.reflect.Field;

record Person(String name, int age) {}

class Example {
    void demo() throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true); // secondary
        field.set(person, "B"); // Noncompliant
    }
}
