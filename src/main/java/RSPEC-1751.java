public class Example {
    public void demonstrateSingleIterationLoop() {
        int i = 0;
        while(i < 10) { // Noncompliant; loop only executes once
            System.out.println("i is " + i);
            i++;
            break;
        }

        for (int j = 0; j < 10; j++) { // Noncompliant; loop only executes once
            if (j == 2) {
                break;
            } else {
                System.out.println("j is " + j);
                return;
            }
        }
    }
}
