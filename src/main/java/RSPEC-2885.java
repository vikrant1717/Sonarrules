import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.xml.xpath.XPath;

public class MyClass {
    private static Calendar calendar = Calendar.getInstance();  // Noncompliant
    private static SimpleDateFormat format = new SimpleDateFormat("HH-mm-ss");  // Noncompliant
    private static XPath xpath; // Noncompliant
}
