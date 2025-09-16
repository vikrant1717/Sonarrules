import java.util.function.Supplier;

public class Foo implements Supplier<Integer> {  // Noncompliant
    @Override
    public Integer get() {
        return 42;
    }
}
