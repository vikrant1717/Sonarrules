import javax.annotation.Nonnull;

public class MainClass {
    @Nonnull
    private String primary;
    private String secondary;

    public MainClass(String color) {
        if (color != null) {
            primary = color;  // Noncompliant: @Nonnull field could be set to null
        }
    }

    public MainClass() { // Noncompliant: @Nonnull field not initialized
    }

    @Nonnull
    public String indirectMix() {
        String mix = null;
        return mix;  // Noncompliant: return value is @Nonnull, but null is returned
    }
}
