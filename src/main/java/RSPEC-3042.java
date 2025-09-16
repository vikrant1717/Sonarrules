import java.io.*;

public class RubberBall implements Serializable {
    private Color color;
    private int diameter;

    public RubberBall(Color color, int diameter) {
        this.color = color;
        this.diameter = diameter;
    }

    public void bounce(float angle, float velocity) {
        // ...
    }

    private synchronized void writeObject(ObjectOutputStream stream) throws IOException { // Noncompliant, "writeObject" is the only synchronized method in this class
        stream.defaultWriteObject();
    }
}

class Color {}
