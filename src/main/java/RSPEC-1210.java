public class Foo implements Comparable<Foo> {
  @Override
  public int compareTo(Foo foo) { return 0; }      // Noncompliant as the equals(Object obj) method is not overridden
}
