sealed class A permits B, C, D, E {} // Noncompliant
final class B extends A {}
final class C extends A {}
final class D extends A {}
final class E extends A {}
