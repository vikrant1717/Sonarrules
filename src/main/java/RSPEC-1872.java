import java.util.List;

// Different packages with same class name
class Laptop {}
class Fruit {}

class Pear extends Laptop {}

class Store {

    public boolean hasSellByDate(Object item) {
        if ("Pear".equals(item.getClass().getSimpleName())) {  // Noncompliant
            return true;  // Results in throwing away week-old computers
        }
        return false;
    }

    public boolean isList(Class<?> valueClass) {
        if (List.class.getName().equals(valueClass.getName())) {  // Noncompliant
            return true;
        }
        return false;
    }
}
