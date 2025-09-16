import java.util.*;

class MyIterator implements Iterator<Integer> {

  private Queue<Integer> elements = new LinkedList<>();

  @Override
  public boolean hasNext() {
    try {
      next(); // Noncompliant, next() is called from hasNext()
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  @Override
  public Integer next() {
    return elements.remove();
  }
}
