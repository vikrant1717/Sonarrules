public class Example {
    public void demonstrateConfusingOperators() {
        int target = -5;
        int num = 3;

        target =- num;  // Noncompliant: target = -3. Is that the intended behavior?
        target =+ num; // Noncompliant: target = 3
        
        boolean flag = true;
        flag =! flag; // Noncompliant: this looks like !=
        
        int value = 10;
        value =- 5; // Noncompliant
    }
}
