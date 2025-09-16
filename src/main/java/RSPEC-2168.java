public class ResourceFactory {
    private static Resource resource;

    public static Resource getInstance() {
        if (resource == null) {
            synchronized (ResourceFactory.class) { // Noncompliant, not thread-safe due to the use of double-checked locking.
                if (resource == null)
                    resource = new Resource();
            }
        }
        return resource;
    }
}

class Resource {
    // Resource implementation
}
