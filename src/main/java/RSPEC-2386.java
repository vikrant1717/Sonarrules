import java.util.*;

public interface MyInterface {
    public static String[] strings; // Noncompliant: public static mutable array
}

public class A {
    public static String[] strings1 = {"first","second"};  // Noncompliant: public static mutable array
    public static String[] strings2 = {"first","second"};  // Noncompliant: public static mutable array  
    public static List<String> strings3 = new ArrayList<>();  // Noncompliant: public static mutable collection
    public static Date creationDate = new Date(); // Noncompliant: public static mutable Date
}
