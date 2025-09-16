import java.util.List;
import java.util.stream.Stream;

class Widget {
    Color getColor() { return Color.RED; }
    int getWeight() { return 1; }
    enum Color { RED }
}

class Example {
    void process(List<Widget> widgets) {
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor() == Widget.Color.RED);
        var res1 = pipeline.findAny();
        var res2 = pipeline.mapToInt(b -> b.getWeight()).sum(); // Noncompliant
    }
}
