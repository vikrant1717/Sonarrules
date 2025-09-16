public class Example {
    String[] arrayOfStrings = {"hello", "world", "test"};
    
    public String concatenateStrings() {
        String str = "";
        for (int i = 0; i < arrayOfStrings.length ; ++i) { // Noncompliant
            str = str + arrayOfStrings[i];
        }
        return str;
    }
}
