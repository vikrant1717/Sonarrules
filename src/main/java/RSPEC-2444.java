public class Example {
    private static Properties fPreferences = null;

    public synchronized void someMethod() {
        // This method being synchronized indicates multi-threaded usage
    }

    private static Properties getPreferences() {
        if (fPreferences == null) {
            fPreferences = new Properties(); // Noncompliant: unsafe lazy initialization
            fPreferences.put("loading", "true");
            fPreferences.put("filterstack", "true");
            readPreferences();
        }
        return fPreferences;
    }
    
    static void readPreferences() {}
}
