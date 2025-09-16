import java.io.Serializable;

public class Raspberry extends Fruit  // Noncompliant; no serialVersionUID.
        implements Serializable {
  private String variety;

  public Raspberry(Season ripe, String variety) {
    this.variety = variety;
  }
  public void setVariety(String variety) { this.variety = variety; }
  public String getVarity() { return variety; }
}

public class AnotherRaspberry extends Fruit
        implements Serializable {
  private final int serialVersionUID = 1; // Noncompliant; not static & int rather than long
  private String variety;
}

class Fruit {}
enum Season { SPRING, SUMMER, FALL, WINTER; }
