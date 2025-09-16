import java.util.List;

class Order {
    public Customer customer;
    public List<Product> products;
}
class Customer {
    public List<Order> orders;
}
class Product {
    public List<Order> orders;
}
