import java.util.List;

class Resource implements AutoCloseable {
    public void close() {}
}

class Example {
    void process(List<String> myIterable) {
        for (String _ : myIterable) { // Noncompliant
            // ...
        }

        try (Resource _ = new Resource()) { // Noncompliant
            // ...
        }
    }
}
