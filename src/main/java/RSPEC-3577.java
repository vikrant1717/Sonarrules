import org.junit.Test;
import org.junit.jupiter.api.Nested;

class Foo {  // Noncompliant
    @Test
    void check() {
        // test
    }
}

class Bar {  // Noncompliant
    @Nested
    class PositiveCase {
        @Test
        void check() {
            // test
        }
    }
}
