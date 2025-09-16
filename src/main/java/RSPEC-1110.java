public class Example {
    public int calculate(int y) {
        int x = ((y / 2 + 1)); // Noncompliant
        
        if (true && ((x + y > 0))) { // Noncompliant
            return ((x + 1)); // Noncompliant
        }
        
        // More examples of redundant parentheses
        int result = ((5 + 3)) * ((2 - 1)); // Noncompliant
        boolean flag = ((true)) && ((false)); // Noncompliant
        
        return ((result)); // Noncompliant
    }
}
