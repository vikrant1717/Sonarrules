import org.junit.jupiter.api.Test;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;
import org.mockito.ArgumentCaptor;

class Example {
    @Test
    public void myTest() {
        // Setting up mock responses
        given(foo.bar(anyInt(), i1, i2)).willReturn(null); // Noncompliant
        when(foo.baz(eq(val1), val2)).thenReturn("hi"); // Noncompliant

        // Simulating exceptions
        doThrow(new RuntimeException()).when(foo).quux(intThat(x -> x >= 42), -1); // Noncompliant

        // Verifying method invocations
        verify(foo).bar(i1, anyInt(), i2); // Noncompliant

        // Capturing arguments for verification
        ArgumentCaptor<Integer> captor = ArgumentCaptor.forClass(Integer.class);
        verify(foo).bar(captor.capture(), i1, any()); // Noncompliant
    }
    Foo foo;
    int i1, i2, val1, val2;
}
