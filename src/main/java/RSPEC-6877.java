import java.util.*;

class Example {
    void foo() {
        var list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        Collections.reverse(list); // Noncompliant
        for (var e : list) {
            // ...
        }
    }

    void foo(List<String> list) {
        var copy = new ArrayList<String>(list);
        Collections.reverse(copy); // Noncompliant
        for (var e : copy) {
            // ...
        }
    }
}
