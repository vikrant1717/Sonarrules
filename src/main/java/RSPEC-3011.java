import java.lang.reflect.*;

public class Example {
    public void makeItPublic(String methodName) throws NoSuchMethodException {
        this.getClass().getMethod(methodName).setAccessible(true); // Noncompliant
    }

    public void setItAnyway(String fieldName, int value) throws NoSuchFieldException, IllegalAccessException {
        this.getClass().getDeclaredField(fieldName).setInt(this, value); // Noncompliant; bypasses controls in setter
    }
    
    public void accessPrivateField() throws Exception {
        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true); // Noncompliant
        field.set("test", "modified".toCharArray());
    }
}
