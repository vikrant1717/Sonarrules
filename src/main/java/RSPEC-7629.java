import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Gatherer;

class Example {
    public void gather() {
        Gatherer<Integer, AtomicInteger, Integer> gatherer = Gatherer.ofSequential(
          () -> new AtomicInteger(-1),
          (state, number, downstream) -> {
            if (state.get() < 0) {
              state.set(number);
              return true;
            }
            return downstream.push(number - state.get());
          },
          Gatherer.defaultFinisher()); // Noncompliant: useless finisher
    }
}
