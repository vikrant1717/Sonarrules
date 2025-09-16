import javax.annotation.*;

public class Fruit {
    private Season ripe;
    private String color;

    public void setRipe(@Nullable Season ripe) {
        this.ripe = ripe;
    }

    @NotNull
    public Integer getProtein() {
        return 12;
    }
}

public class Raspberry extends Fruit {
    public void setRipe(@NotNull Season ripe) {  // Noncompliant: tightening contract
        this.ripe = ripe;
    }

    @Nullable
    public Integer getProtein() {  // Noncompliant: loosening contract
        return null;
    }
}

enum Season { SPRING, SUMMER, FALL, WINTER }
