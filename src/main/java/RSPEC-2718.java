import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import org.apache.commons.lang3.time.DateUtils;

public class Example {
    public Date trunc(Date date) {
        return DateUtils.truncate(date, Calendar.SECOND);  // Noncompliant
    }
    
    public Date truncateToMinute(Date date) {
        return DateUtils.truncate(date, Calendar.MINUTE); // Noncompliant
    }
}
