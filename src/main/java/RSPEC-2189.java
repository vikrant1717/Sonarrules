public class Example {
    public void demonstrateInfiniteLoops() {
        for (;;) {  // Noncompliant: infinite loop
            System.out.println("This runs forever");
        }

        int j = 0;
        while (true) { // Noncompliant: no break condition
            j++;
            System.out.println(j);
        }

        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant: b never changes
            k++;
            System.out.println(k);
        }
        
        do {
            System.out.println("Infinite do-while");
        } while (true); // Noncompliant: always true
    }
}
