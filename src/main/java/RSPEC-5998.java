import java.util.regex.Pattern;

class Example {
    void demo() {
        Pattern.compile("(a|b)*"); // Noncompliant
        Pattern.compile("(.|\n)*"); // Noncompliant
        Pattern.compile("(ab?)*"); // Noncompliant
    }
}
