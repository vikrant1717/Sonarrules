import java.io.Serializable;
import java.time.chrono.HijrahDate;

class MyClass implements Serializable {
    private HijrahDate date;  // Noncompliant; mark this transient
}
