import java.nio.file.Path;

class ClassFile {
    static ClassFile of() { return new ClassFile(); }
    ClassModel parse(Path path) { return new ClassModel(); }
    byte[] transformClass(ClassModel model, Object symbol, java.util.function.BiConsumer<ClassBuilder, ClassElement> consumer) { return new byte[0]; }
}

class ClassModel {
    Object thisClass() { return new Object(); }
}

class ClassBuilder {}
class ClassElement {}

public class Example {
    public static void transformClassFile(Path path) {
        ClassFile classFile = ClassFile.of();
        ClassModel classModel = classFile.parse(path);
        byte[] newBytes = classFile.transformClass(classModel,
          classModel.thisClass(), // Noncompliant
          (classBuilder, classElement) -> {
            // ...
          });
    }
}
