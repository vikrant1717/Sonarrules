import java.util.List;

class Entity implements Cloneable { // Noncompliant, using `Cloneable`
    public int value;
    public List<Entity> children; // deep copy wanted

    Entity() {
        EntityManager.register(this); // invariant
    }

    @Override
    public Entity clone() {
        try {
            Entity copy = (Entity) super.clone(); // invariant not enforced, because no constructor is called
            copy.children = children.stream().map(Entity::clone).toList();
            return copy;
        } catch (CloneNotSupportedException e) { // this will not happen due to behavioral contract
            throw new AssertionError();
        }
    }
}

class EntityManager {
    static void register(Entity entity) {}
}
