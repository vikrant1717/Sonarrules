record Point(Float x, Float y, Float z) {}
record Plane(Point normal, Float d) {}

class Example {
    void print1(Object obj) {
        if (obj instanceof Point p) { // Noncompliant, all fields accessed
            Float x = p.x();
            Float y = p.y();
            System.out.println(x + y + p.z());
        }
    }

    void print2(Object obj) {
        if (obj instanceof Point) { // Noncompliant, not using pattern matching
            Point p = (Point) obj;
            Float x = p.x();
            Float y = p.y();
            System.out.println(x + y + p.z());
        }
    }

    void print3(Object obj) {
        if (obj instanceof Plane(Point normal, Float d)) { // Noncompliant, should use nested record pattern
            System.out.println(normal.x() + normal.y() + normal.z());
            System.out.println(d);
        }
    }
}
