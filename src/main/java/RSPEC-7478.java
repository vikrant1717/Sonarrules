import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

class ClassFile {
    static ClassFile of() { return new ClassFile(); }
    ClassModel parse(Path path) { return new ClassModel(); }
    byte[] build(Object symbol, java.util.function.Consumer<ClassBuilder> builderConsumer) { return new byte[0]; }
}

class ClassModel {
    Object thisClass() { return new Object(); }
    java.util.Iterator<ClassElement> iterator() { return null; }
}

class ClassElement {}
class MethodModel extends ClassElement {
    MethodName methodName() { return new MethodName(); }
}
class MethodName {
    String stringValue() { return ""; }
}
class ClassBuilder {
    void with(ClassElement element) {}
}

public class Example {
    public static void transformClassFile(Path path) throws IOException {
      ClassFile classFile = ClassFile.of();
      ClassModel classModel = classFile.parse(path);
      byte[] newBytes = classFile.build( // Noncompliant
        classModel.thisClass(), classBuilder -> {
            for (ClassElement classElement : classModel) {
              if (!(classElement instanceof MethodModel methodModel &&
                  methodModel.methodName().stringValue().startsWith("debug"))) {
                classBuilder.with(classElement);
              }
            }
        });
      Files.write(path, newBytes);
    }
}
