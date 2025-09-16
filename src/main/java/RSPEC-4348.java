import java.util.Iterator;

class FooIterator implements Iterator<Foo>, Iterable<Foo> {
    private Foo[] seq;
    private int idx = 0;

    public boolean hasNext() {
        return idx < seq.length;
    }

    public Foo next() {
        return seq[idx++];
    }

    public Iterator<Foo> iterator() {
        return this; // Noncompliant
    }
}

class Foo {
    // Simple class for demonstration
}
