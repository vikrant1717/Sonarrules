import java.util.*;

class A {
    private String[] strings;
    private List<String> names;
    private Date lastModified;

    public A() {
        strings = new String[]{"first", "second"};
        names = new ArrayList<>();
        lastModified = new Date();
    }

    public String[] getStrings() {
        return strings; // Noncompliant: returning mutable private array directly
    }

    public List<String> getNames() {
        return names; // Noncompliant: returning mutable private collection directly
    }

    public Date getLastModified() {
        return lastModified; // Noncompliant: returning mutable private Date directly
    }

    public void setStrings(String[] strings) {
        this.strings = strings;  // Noncompliant: storing mutable parameter directly
    }

    public void setNames(List<String> names) {
        this.names = names;  // Noncompliant: storing mutable parameter directly
    }
}

public class B {
    private A a = new A();  // At this point a.strings = {"first", "second"};

    public void wreakHavoc() {
        a.getStrings()[0] = "yellow";  // a.strings = {"yellow", "second"};
    }
}
