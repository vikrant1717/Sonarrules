public class Example {
    public int clamp1(int value, int min, int max) {
        return value > max ? max : value < min ? min : value; // Noncompliant; Replace with Math.clamp
    }

    public int clamp2(int value, int min, int max) {
        return Math.max(min, Math.min(max, value)); // Noncompliant; Replace with Math.clamp
    }
}
