import java.io.Serializable;

public class Example {
    private transient String tempData = "temporary"; // Noncompliant
    private String regularData = "regular";
}
