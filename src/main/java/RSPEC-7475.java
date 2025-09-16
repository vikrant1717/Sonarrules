record Guest(String name, String email, String phoneNumber) {}

class Example {
    String greet(Object o) {
        if (o instanceof Guest(String name, String _, String _)) { // Noncompliant
            return "Hello " + name + "!";
        }
        return "Hello!";
    }

    String switchToGreet(Object o) {
        return switch (o) {
            case Guest(String name, String _, String _) -> "Hello " + name + "!"; // Noncompliant
            default -> "Hello!";
        };
    }
}
