public class Fruit {
    protected Season ripe;
    protected Color flesh;
}

public class Raspberry extends Fruit {
    private boolean ripe;  // Noncompliant: hides parent field
    private static Color FLESH; // Noncompliant: hides parent field
    
    public void process() {
        // Confusion about which 'ripe' is being used
        if (ripe) {  // local boolean field
            // vs parent's Season ripe field
        }
    }
}

enum Season { SPRING, SUMMER, FALL, WINTER }
class Color {}
