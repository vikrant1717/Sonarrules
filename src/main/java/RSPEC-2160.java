class Foo {
    final int a;
    
    public Foo(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (getClass() != other.getClass()) return false;
        return a == ((Foo) other).a;
    }
}

class Bar extends Foo { // Noncompliant, `equals` ignores the value of `b`
    final int b;
    
    public Bar(int a, int b) {
        super(a);
        this.b = b;
    }
}
