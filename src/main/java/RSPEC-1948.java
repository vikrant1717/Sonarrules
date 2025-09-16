import java.io.Serializable;
import java.util.logging.Logger;

public class Person implements Serializable {
    private static final long serialVersionUID = 1905122041950251207L;

    private String name;
    private Address address;  // Noncompliant, Address is not serializable
    private Logger logger;    // Noncompliant, Logger is not serializable
}

class Address {
    private String street;
    private String city;
}
