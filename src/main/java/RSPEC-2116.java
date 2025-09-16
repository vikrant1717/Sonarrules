public class Example {
    public static void main(String[] args) {
        String argStr = args.toString();       // Noncompliant
        int argHash = args.hashCode();         // Noncompliant
        
        int[] numbers = {1, 2, 3, 4, 5};
        String numberStr = numbers.toString(); // Noncompliant
        int numberHash = numbers.hashCode();   // Noncompliant
    }
}
