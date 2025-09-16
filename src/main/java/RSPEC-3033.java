public class Example {
    public void demonstrateStringBuilderToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        
        if ("".equals(sb.toString())) { // Noncompliant
            // ...
        }
        if (sb.toString().isEmpty()) { // Noncompliant
            // ...
        }
        
        StringBuffer buffer = new StringBuffer();
        buffer.append("World");
        
        if (buffer.toString().length() == 0) { // Noncompliant
            // ...
        }
    }
}
