import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.SOURCE)
@interface MySourceAnnotation {}

public class Example {
    void execute(Method method) {
        if (method.isAnnotationPresent(Override.class)) { // Noncompliant, if condition will always be false because @Override is declared with @Retention(RetentionPolicy.SOURCE)
            // ...
        }
        
        if (method.isAnnotationPresent(MySourceAnnotation.class)) { // Noncompliant
            // ...
        }
    }
}
