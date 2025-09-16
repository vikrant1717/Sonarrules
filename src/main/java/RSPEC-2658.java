public class Example {
    public void demonstrateDynamicClassLoading() {
        try {
            String className = System.getProperty("messageClassName");
            Class clazz = Class.forName(className);  // Noncompliant: dynamic class loading
            
            // More examples
            String userInput = "com.example.UserClass";
            Class userClass = Class.forName(userInput);  // Noncompliant
            
            ClassLoader loader = getClass().getClassLoader();
            Class loadedClass = loader.loadClass("com.example.DynamicClass");  // Noncompliant
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
