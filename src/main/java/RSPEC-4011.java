import java.util.Date;

public class Example {
    public void createDate() {
        Date birthday;
        birthday = new Date("Sat Sep 27 05:42:21 EDT 1986");  // Noncompliant
        birthday = new Date(528176541000L); // Compliant
    }
}
