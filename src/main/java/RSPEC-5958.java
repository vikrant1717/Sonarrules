import static org.assertj.core.api.Assertions.assertThatThrownBy;

class Example {
    void test() {
        assertThatThrownBy(() -> shouldThrow()); // Noncompliant
    }
    void shouldThrow() { throw new RuntimeException("fail"); }
}
