public class Example {
    void foo(int n, int m) {
        switch (n) {
            case 0:
                switch (m) {  // Noncompliant; nested switch
                    case 1:
                        System.out.println("Case 1");
                        break;
                    case 2:
                        System.out.println("Case 2");
                        break;
                }
                break;
            case 1:
                System.out.println("Other case");
                break;
            default:
                System.out.println("Default");
        }
    }
}
