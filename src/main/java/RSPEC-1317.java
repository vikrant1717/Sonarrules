public class Example {
    public void demonstrateStringBuilderIssues() {
        StringBuffer foo = new StringBuffer('x'); // Noncompliant: char literal instead of string
        StringBuilder bar = new StringBuilder('A'); // Noncompliant: char literal instead of string
        
        char firstChar = 'Z';
        StringBuffer baz = new StringBuffer(firstChar); // Noncompliant: char variable instead of string
    }
}
