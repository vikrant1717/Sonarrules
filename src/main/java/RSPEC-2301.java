public class Example {
    public String tempt(String name, boolean ofAge) { // Noncompliant: boolean selector argument
        if (ofAge) {
            offerLiquor(name);
            return "Offered liquor";
        } else {
            offerCandy(name);
            return "Offered candy";
        }
    }
    
    public void process(String data, boolean shouldValidate) { // Noncompliant: boolean selector
        if (shouldValidate) {
            validateData(data);
        }
        processData(data);
    }

    public void corrupt() {
        tempt("Joe", false); // does this mean not to tempt Joe?
        process("data", true); // unclear what true means
    }
    
    void offerLiquor(String name) {}
    void offerCandy(String name) {}
    void validateData(String data) {}
    void processData(String data) {}
}
