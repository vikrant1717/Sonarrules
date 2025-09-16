import java.util.stream.Gatherer;

class Example {
    private static Gatherer<Integer, Void, Integer> inRange(int start, int end) {
        return Gatherer.<Integer, Void, Integer>ofSequential(
          () -> null, // Noncompliant: unnecessary initializer
          (_, element, downstream) -> {
            if (element >= start && element <= end)
              return downstream.push(element - start);
            return !downstream.isRejecting();
          },
          (_, downstream) -> downstream.push(-1)
        );
    }
}
