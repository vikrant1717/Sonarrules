public class Example {
    public void handle(String command) {
        command.toLowerCase(); // Noncompliant: result thrown away
        
        String text = "HELLO WORLD";
        text.trim(); // Noncompliant: result ignored
        text.substring(0, 5); // Noncompliant: result ignored
        
        java.util.Optional<String> opt = java.util.Optional.of("test");
        opt.map(String::toUpperCase); // Noncompliant: result ignored
        
        java.util.Arrays.asList("a", "b", "c").stream()
                        .filter(s -> s.length() > 1)
                        .collect(java.util.stream.Collectors.toList()); // Noncompliant: result ignored
    }
}
