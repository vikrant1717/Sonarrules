public abstract class Car {
  public abstract void start(Environment c);

  public void stop(Environment c) {
    c.freeze(this);
  }
}

class Environment {
  void freeze(Object obj) {}
}
