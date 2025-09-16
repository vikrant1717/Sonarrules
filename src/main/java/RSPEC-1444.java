public class Greeter {
  public static Foo foo = new Foo(); // Noncompliant: public static without final
  public static String message = "Hello"; // Noncompliant: public static without final
  // ...
}

class Foo {}
