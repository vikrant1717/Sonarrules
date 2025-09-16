import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {  // Noncompliant
  public int compare(Fruit f1, Fruit f2) {
    return f1.getName().compareTo(f2.getName());
  }
  
  public boolean equals(Object obj) {
    return this == obj;
  }
}

class Fruit {
  private String name;
  public String getName() { return name; }
}
