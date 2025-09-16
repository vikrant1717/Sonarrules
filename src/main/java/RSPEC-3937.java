public class Example {
    public void demonstrateIrregularSeparators() {
        int thousand = 100_0;        // Noncompliant
        int tenThousand = 100_00;    // Noncompliant
        int million = 1_000_00_000;  // Noncompliant
    }
}
