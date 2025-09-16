public class Example {
    public int DoSomething() { // Noncompliant: method name should start with lowercase
        return 0;
    }
    
    public void PROCESS_DATA() { // Noncompliant: should use camelCase instead of all caps with underscores
        // method implementation
    }
    
    public String Get_User_Name() { // Noncompliant: should use camelCase instead of Pascal_Case with underscores
        return "username";
    }
    
    public void calculate_total() { // Noncompliant: should use camelCase instead of snake_case
        // method implementation
    }
    
    public boolean IsValid() { // Noncompliant: method name should start with lowercase
        return true;
    }
    
    // Compliant by exception - overriding methods are excluded
    @Override
    public int Do_Something() { // Compliant by exception
        return 0;
    }
}
