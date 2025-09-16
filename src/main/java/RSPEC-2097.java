public class MyClass {
    private String name;
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        MyClass that = (MyClass) obj; // Noncompliant, may throw a ClassCastException
        return name.equals(that.name);
    }
}
