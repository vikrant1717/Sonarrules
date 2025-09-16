public class Example {
    public void demonstrateTernaryTypeCoercion() {
        boolean condition = true;
        
        Integer i = 123456789;
        Float f = 1.0f;
        Number n1 = condition ? i : f;  // Noncompliant, unexpected precision loss, n1 = 1.23456792E8
        
        Long l = 999999999999L;
        Double d = 1.0;
        Number n2 = condition ? l : d;  // Noncompliant, unexpected precision loss
    }
}
