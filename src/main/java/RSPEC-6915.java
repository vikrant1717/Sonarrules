public class Example {
    public void indexOfExamples() {
        String hello = "Hello, world!";
        int index1 = hello.indexOf('o', 11, 7); // Noncompliant, 11..7 is not a valid range
        int index2 = hello.indexOf('o', -1, 11); // Noncompliant, because beginIndex is negative
    }
}
