public class Example {
    public void demonstrateUnnecessaryBoxing() {
        int myInt = 4;
        String myIntString = (new Integer(myInt)).toString(); // Noncompliant; creates & discards an Integer object
        myIntString = Integer.valueOf(myInt).toString(); // Noncompliant
        
        double myDouble = 5.5;
        String myDoubleString = Double.valueOf(myDouble).toString(); // Noncompliant
    }
}
