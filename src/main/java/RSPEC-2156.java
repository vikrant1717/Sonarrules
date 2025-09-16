public final class MyFinalClass {
    protected String name = "Fred";  // Noncompliant
    protected void setName(String name) {  // Noncompliant
        this.name = name;
    }
    
    protected int calculate() {      // Noncompliant
        return 42;
    }
}
