import java.util.logging.Logger;

public class Example {
    public Logger logger = Logger.getLogger(Example.class.getName());  // Noncompliant: not private static final
    protected Logger log = Logger.getLogger("MyLogger"); // Noncompliant: not private static final
    static Logger staticLog = Logger.getLogger("StaticLogger"); // Noncompliant: not private and final
}
