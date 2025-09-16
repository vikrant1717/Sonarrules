import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Example {
    public void demonstrateWeekYearIssue() throws Exception {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   // Noncompliant; yields '2016/12/31'
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd"); // Noncompliant; yields '2016/12/31'
    }
}
