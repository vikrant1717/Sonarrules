import java.util.*;

public class Employees {
  public final HashSet<Employee> employees   // Noncompliant, field type should be "Set"
    = new HashSet<Employee>();

  public HashSet<Employee> getEmployees() {  // Noncompliant, return type should be "Set"
    return employees;
  }
  
  public void processEmployees(ArrayList<Employee> empList) { // Noncompliant, parameter should be "List"
    // method implementation
  }
}

class Employee {}
