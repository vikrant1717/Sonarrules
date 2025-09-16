import java.util.*;

class Example {
    void printLastToFirst(List<String> list) {
        for (var it = list.listIterator(list.size()); it.hasPrevious();) {
            var element = it.previous();
            System.out.println(element); // Noncompliant
        }
    }
}
