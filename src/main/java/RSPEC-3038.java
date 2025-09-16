public interface Reportable {
    String getReport();
}

public abstract class AbstractRuleReport implements Reportable {
    public abstract String getReport();  // Noncompliant

    public abstract void process(); // Compliant - not in interface
}
