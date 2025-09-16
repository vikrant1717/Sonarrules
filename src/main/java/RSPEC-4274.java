public class Example {
    private static final int MAX_PRICE = 1000;
    
    public void setPrice(int price) {
        assert price >= 0 && price <= MAX_PRICE; // Noncompliant
        // Set the price
    }
}
