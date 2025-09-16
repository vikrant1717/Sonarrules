import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class Example {
    @Test
    void test_requiring_MyClass() {
        MyClass myClassMock = mock(MyClass.class); // Noncompliant
        when(myClassMock.f()).thenReturn(1);
        when(myClassMock.g()).thenReturn(2);
        //...
    }
}

abstract class MyClass {
    abstract int f();
    abstract int g();
}
