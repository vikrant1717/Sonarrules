class Example {
    private String hexString(Object o) {
        return Integer.toHexString((Integer) o); // Noncompliant: may throw ClassCastException if o is not Integer
    }

    int foo(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape; // Noncompliant: may throw ClassCastException
        } else if (shape instanceof Square) {
            Square square = (Square) shape; // Noncompliant: may throw ClassCastException
        }
        // Default
        return 0;
    }
}

class Shape {}
class Circle extends Shape {}
class Square extends Shape {}
