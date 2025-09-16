import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Gatherer;

class Example {
    public static List<Integer> diffWithFirstPositive(List<Integer> list) {
        Gatherer<Integer, AtomicInteger, Integer> gatherer = Gatherer.of(
          () -> new AtomicInteger(-1),
          (state, number, downstream) -> {
            if (state.get() < 0) {
              state.set(number);
              return true;
            }
            return downstream.push(number - state.get());
          },
          (_, _) -> {
            throw new IllegalStateException();
          },
          Gatherer.defaultFinisher());
        return list.stream().gather(gatherer).toList();
    }
}
