class Parent {
    public static int counter;
}

class Child extends Parent {
    public Child() {
        Child.counter++;  // Noncompliant
    }
    
    public void incrementCounter() {
        Child.counter += 5; // Noncompliant
    }
}
