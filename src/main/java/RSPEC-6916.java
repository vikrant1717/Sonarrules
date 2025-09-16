public class Example {
    void testObject(Object response) {
        switch (response) {
            case String s -> {
                if(s.length() > 80) { // Noncompliant; use the "when" keyword
                    System.out.println("This string is too long");
                }
            }
            case Integer i -> {
                if(i > 80) { // Noncompliant; use the "when" keyword
                    System.out.println("This integer is too big");
                }
            }
            default -> System.out.println("Unknown type");
        }
    }
}
