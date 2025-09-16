class Example {
    void demonstrateSystemExit() {
        System.exit(0); // Noncompliant
        Runtime.getRuntime().exit(0); // Noncompliant
        Runtime.getRuntime().halt(0); // Noncompliant
    }
}
