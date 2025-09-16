import java.util.Optional;

public class Example {
    public Optional<String> getOptionalValue() {
        return Optional.of("test");
    }
    
    public void demonstrateUnsafeOptionalUsage() {
        Optional<String> value = this.getOptionalValue();
        
        String stringValue = value.get(); // Noncompliant
        
        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("Not found");
        }
        String value2 = methodThatReturnsOptional().get(); // Noncompliant: indirect access
    }
    
    Optional<String> methodThatReturnsOptional() {
        return Optional.of("test");
    }
}
