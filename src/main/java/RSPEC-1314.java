public class Example {
    int myNumber = 010; // Noncompliant. myNumber will hold 8, not 10 - was this really expected?
    int anotherNumber = 0755; // Noncompliant: octal literal
    int yetAnother = 077; // Noncompliant: octal literal
}
