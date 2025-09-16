import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestName;

public class ProjectDefinitionTest {
    @Rule
    public TemporaryFolder temp = new TemporaryFolder();  // Noncompliant

    @Rule
    public TestName testName = new TestName(); // Noncompliant

    @Test
    public void shouldSetKey() {
        ProjectDefinition def = ProjectDefinition.create();
        def.setKey("mykey");
        // assertThat(def.getKey(), is("mykey"));
    }
}

class ProjectDefinition {
    private String key;
    
    static ProjectDefinition create() {
        return new ProjectDefinition();
    }
    
    void setKey(String key) {
        this.key = key;
    }
    
    String getKey() {
        return key;
    }
}
