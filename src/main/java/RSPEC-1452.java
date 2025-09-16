import java.util.List;

public class Example {
    // Noncompliant: return type with wildcards
    public List<? extends Animal> getAnimals() { 
        return null;
    }
    
    // Noncompliant: return type with wildcards
    public List<? super Plant> getLifeforms() { 
        return null;
    }
    
    // Noncompliant: method parameter with wildcards
    public void processAnimals(List<? extends Animal> animals) {
        // method body
    }
}

class Animal {}
class Plant {}
