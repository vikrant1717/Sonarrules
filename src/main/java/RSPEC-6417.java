import java.util.List;

public static void foo(List<String> lst) {
  for (String element : lst) {
    if (element.startsWith("x")) {
      lst.remove(element); // Noncompliant: modifies collection during iteration
    }
  }
}
