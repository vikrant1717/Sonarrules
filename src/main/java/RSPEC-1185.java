public class Example extends ParentClass {
    public void doSomething() { // Noncompliant: useless override
      super.doSomething();
    }

    @Override
    public boolean isLegal(Action action) { // Noncompliant: useless override
      return super.isLegal(action);
    }
}

class ParentClass {
    public void doSomething() {}
    public boolean isLegal(Action action) { return true; }
}

class Action {}
