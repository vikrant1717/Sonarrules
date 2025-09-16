import java.util.*;

class Example {

    private final Deque<Integer> stack = new LinkedList<>();

    public void evaluate(int operator) {
      switch (operator) {
        case 1: {
          /* ... */
          { // Noncompliant - Extract this nested code block into a method
            int a = stack.pop();
            int b = stack.pop();
            int result = a + b;
            stack.push(result);
          }
          /* ... */
          break;
        }
        /* ... */
      }
    }
}
