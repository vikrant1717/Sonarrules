class Foo implements Cloneable { // Noncompliant, override `clone` method
    public int value;
}

class Bar implements Cloneable { // Noncompliant
    private String name;
    private int id;
}
