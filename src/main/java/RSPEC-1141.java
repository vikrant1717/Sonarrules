class Example {
    void demonstrateNestedTryCatch() {
        try {
            riskyOperation1();
        } catch (Exception e1) {
            try { // Noncompliant - nested try/catch
                riskyOperation2();
            } catch (Exception e2) {
                handleException(e2);
            }
        }
    }
    
    void riskyOperation1() throws Exception {}
    void riskyOperation2() throws Exception {}
    void handleException(Exception e) {}
}
