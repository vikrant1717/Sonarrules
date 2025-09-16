import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Example {
    public void demonstrateOldDateAPI() {
        Date now = new Date();  // Noncompliant
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        Calendar christmas  = Calendar.getInstance();  // Noncompliant
        
        try {
            christmas.setTime(df.parse("25.12.2020"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
