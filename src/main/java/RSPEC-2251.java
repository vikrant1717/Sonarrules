public class Example {
    public void demonstrateWrongDirection() {
        for (int i = 10; i > 0; i++) { // Noncompliant: counter moves away from condition
            System.out.println("Hello, world!"); // executed many times, not 10
        }

        for (int j = 0; j < 10; j--) { // Noncompliant: counter moves away from condition
            System.out.println("This will cause issues"); // ArrayIndexOutOfBoundsException likely
        }
        
        String[] strings = {"a", "b", "c"};
        for (int k = 0; k < strings.length; k--) { // Noncompliant: wrong direction
            String string = strings[k];  // will get ArrayIndexOutOfBoundsException
        }
    }
}
