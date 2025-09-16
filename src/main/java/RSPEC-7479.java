class ClassBuilder {
    ClassBuilder withMethod(String name, Object type, int flags, java.util.function.Consumer<MethodBuilder> methodBuilderConsumer) {
        // ...
        return this;
    }
    ClassBuilder withMethodBody(String name, Object type, int flags, java.util.function.Consumer<CodeBuilder> codeBuilderConsumer) {
        // ...
        return this;
    }
}

class MethodBuilder {
    MethodBuilder withCode(java.util.function.Consumer<CodeBuilder> codeBuilderConsumer) {
        // ...
        return this;
    }
}

class CodeBuilder {
    CodeBuilder getstatic(Object a, String b, Object c) { return this; }
    CodeBuilder ldc(String s) { return this; }
    CodeBuilder invokevirtual(Object a, String b, Object c) { return this; }
    CodeBuilder return_() { return this; }
}

class Example {
    static final Object MTD_void = null;
    static final int ACC_PUBLIC = 1;
    static final int ACC_STATIC = 8;

    ClassBuilder addMethod(ClassBuilder builder) {
        return builder
            .withMethod("foo", MTD_void, ACC_PUBLIC | ACC_STATIC, methodBuilder -> { // Noncompliant
                methodBuilder.withCode(codeBuilder ->
                    codeBuilder.getstatic(ClassDesc.of("java.lang.System"), "out", ClassDesc.of("java.io.PrintStream"))
                        .ldc("Hello World")
                        .invokevirtual(ClassDesc.of("java.io.PrintStream"), "println", MTD_void)
                        .return_()
                );
            });
    }
}

class ClassDesc {
    static Object of(String s) { return null; }
}
