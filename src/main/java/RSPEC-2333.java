public interface Vehicle {
    public void go(int speed, Direction direction);  // Noncompliant: public redundant in interface
    public abstract void stop(); // Noncompliant: public abstract redundant
    public static final int MAX_SPEED = 100; // Noncompliant: public static final redundant
}

public final class FinalClass {
    public final void method() { // Noncompliant: final redundant in final class
        // method body
    }
}

enum MyEnum {
    VALUE1, VALUE2;
    
    private MyEnum() { // Noncompliant: private redundant for enum constructor
        // constructor body
    }
}

class OuterClass {
    static interface NestedInterface { // Noncompliant: static redundant for interface in class
        void method();
    }
}

enum Direction { NORTH, SOUTH, EAST, WEST }
