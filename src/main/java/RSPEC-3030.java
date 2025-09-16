import static java.lang.Math.*;
import static java.util.Collections.*;
import static com.myco.corporate.Constants.*;
import static com.myco.division.Constants.*;
import static com.myco.department.Constants.*;  // Noncompliant

public class Example {
    public void demonstrateStaticImports() {
        double result = sqrt(pow(3, 2) + pow(4, 2));
        List<String> list = emptyList();
    }
}
