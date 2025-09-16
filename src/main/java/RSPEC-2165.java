public class Foo {
    private String name;
    private Object data;

    @Override
    protected void finalize() {
        name = null;  // Noncompliant, instance will be removed anyway
        data = null;  // Noncompliant, instance will be removed anyway
    }
}
