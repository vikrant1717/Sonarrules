import java.io.Serializable;

// Noncompliant; this Raspberry's ancestor doesn't have a no-argument constructor
// this rule raises an issue on the Raspberry class declaration
public class Fruit {
  private Season pickingSeason;
  public Fruit(Season pickingSeason) {
    this.pickingSeason = pickingSeason;
  }
}

public class Raspberry extends Fruit implements Serializable {
  private static final long serialVersionUID = 1;
  private String variety;
  public Raspberry(String variety) {
    super(Season.SUMMER);
    this.variety = variety;
  }
}

enum Season { SPRING, SUMMER, FALL, WINTER; }
