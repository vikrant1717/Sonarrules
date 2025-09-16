import java.util.List;

class Example {
    void parse(List<String> elements, int idx) {
        int value = 0;
        try {
            var elem = elements.get(idx);
            value = Integer.parseInt(elem);
        } catch (NumberFormatException nfe) { // Noncompliant
            System.err.println("Wrong number format");
        } catch (IndexOutOfBoundsException ioob) {  // Noncompliant
            System.err.println("No such element");
        }
    }
}
