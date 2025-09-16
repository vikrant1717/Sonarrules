import org.junit.jupiter.api.*;

class Example {
    @Test
    @RepeatedTest(2) // Noncompliant
    void test() { }

    @ParameterizedTest
    @Test
    @MethodSource("methodSource")
    void test2(int argument) { } // Noncompliant
}
