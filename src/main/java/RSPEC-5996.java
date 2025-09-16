import java.util.regex.Pattern;

class Example {
    void demo() {
        // This can never match because $ and ^ have been switched around
        Pattern.compile("$[a-z]+^"); // Noncompliant
    }
}
