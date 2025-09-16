import java.io.Serializable;

public class Outer {
    public class Inner implements Serializable { // Noncompliant
        private static final long serialVersionUID = 1L;
        private String data;
    }
}
