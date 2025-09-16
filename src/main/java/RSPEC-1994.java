public class Example {
    public void demonstrateIncorrectForLoop() {
        for (int i = 0; i < 10; ) { // Noncompliant, i not updated in increment clause
            System.out.println(i);
            i++;
        }

        int sum = 0;
        for (int i = 0; i < 10; sum++) { // Noncompliant, i not updated in increment clause
            System.out.println(i);
            i++;
        }
    }
}
