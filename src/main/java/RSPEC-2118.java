import java.io.*;

public class Vegetable {
    // ...
}

public class Menu {
    public void meal(ObjectOutputStream oos) throws IOException {
        Vegetable veg = new Vegetable();
        oos.writeObject(veg);  // Noncompliant
    }
}
