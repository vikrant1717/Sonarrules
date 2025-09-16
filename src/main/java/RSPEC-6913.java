public class Example {
    public void clampExamples(int red) {
        Math.clamp(red, 255, 0);      // Noncompliant, [255,0] is not a valid range
        Math.clamp(red, red, 255);    // Noncompliant, use Math.min(red, 255)
        Math.clamp(red, 0, red);      // Noncompliant, use Math.max(red, 0)
        Math.clamp(red, 42, 42);      // Noncompliant, min == max
    }
}
