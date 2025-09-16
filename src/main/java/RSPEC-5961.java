import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Example {
    @Test
    void test() { // Refactor this method.
        assertEquals(1, f(1));
        assertEquals(2, f(2));
        assertEquals(3, g(1));
    }
    int f(int x) { return x; }
    int g(int x) { return x + 2; }
}
