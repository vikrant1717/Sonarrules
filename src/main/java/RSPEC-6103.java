import static org.assertj.core.api.Assertions.assertThat;

class Example {
    void demo(Object myObject) {
        assertThat(myObject).isInstanceOfSatisfying(String.class, s -> "Hello".equals(s)); // Noncompliant
        assertThat(myObject).satisfies("Hello"::equals); // Noncompliant
    }
}
