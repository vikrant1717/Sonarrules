import org.springframework.stereotype.Component;

@Component
public class ExampleClass { // Noncompliant: multiple constructors, no @Autowired
    private final DependencyClass1 dependency1;

    public ExampleClass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public ExampleClass(DependencyClass1 dependency1) {
        this.dependency1 = dependency1;
    }
}

class DependencyClass1 {}
