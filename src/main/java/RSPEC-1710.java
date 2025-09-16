// Noncompliant, wrapper annotations are not necessary in Java 8+
@SomeAnnotations({  
  @SomeAnnotation("a"),
  @SomeAnnotation("b"),
  @SomeAnnotation("c"),
})
public class SomeClass {
    // class implementation
}

// Placeholder annotations for example
@interface SomeAnnotations {
    SomeAnnotation[] value();
}

@interface SomeAnnotation {
    String value();
}
