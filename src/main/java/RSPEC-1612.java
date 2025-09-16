import java.util.List;

class A {
  void process(List<A> list) {
    list.stream()
      .filter(myListValue -> myListValue instanceof B)     // Noncompliant
      .map(listValueToMap -> (B) listValueToMap)           // Noncompliant
      .map(bValueToMap -> bValueToMap.<String>getObject()) // Noncompliant
      .forEach(o -> System.out.println(o));                // Noncompliant
  }
}

class B extends A {
  <T> T getObject() {
    return null;
  }
}
