import jakarta.persistence.*;
import java.util.List;

@Entity
public class ParentEntity {
    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER) // Noncompliant
    private List<ChildEntity> children;
}

@Entity
public class ChildEntity {
    @OneToMany(mappedBy = "child", fetch = FetchType.EAGER) // Noncompliant
    private List<ParentEntity> parents;
}
