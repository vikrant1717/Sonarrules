public class Example {
    // Noncompliant: method with too many parameters (assuming threshold is 7)
    void setCoordinates(int x1, int y1, int z1, int x2, int y2, int z2, int x3, int y3, int z3) {
        // method implementation
    }
    
    // Noncompliant: method with many parameters
    void processData(String name, int age, String address, String city, String state, String zip, String country, String phone) {
        // method implementation
    }
    
    // Noncompliant: constructor with too many parameters
    public Example(String param1, String param2, String param3, String param4, String param5, String param6, String param7, String param8) {
        // constructor implementation
    }
    
    // Noncompliant: method with various parameter types
    void complexMethod(int a, double b, String c, boolean d, Object e, String f, int g, double h, boolean i) {
        // method implementation
    }
}
