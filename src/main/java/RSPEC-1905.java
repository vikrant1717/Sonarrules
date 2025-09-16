import java.util.List;

class Example {
    public void example(List<String> list) {
        for (String item: (List<String>) list) {  // Noncompliant, Remove this unnecessary cast to "List".
            System.out.println(item);
        }
    }
}
