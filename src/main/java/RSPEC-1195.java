public class Cube {
    private int magicNumbers[] = { 42 };      // Noncompliant: array brackets should be with type
    public int getVector()[] { return null; }    // Noncompliant: array brackets should be with type
    public int[] getMatrix()[] { return null; }  // Noncompliant: mixed bracket placement
}
