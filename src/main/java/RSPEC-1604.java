import java.util.function.Function;
import java.util.function.Predicate;

public class Example {
    public void demonstrateLambdaReplacement() {
        myCollection.stream().map(new Function<String,String>() { // Noncompliant, use a lambda expression instead
            @Override
            public String apply(String input) {
                return new StringBuilder(input).reverse().toString();
            }
        });
        
        Predicate<String> isEmpty = new Predicate<String>() { // Noncompliant, use a lambda expression instead
            @Override
            public boolean test(String myString) {
                return myString.isEmpty();
            }
        };
    }
    
    java.util.Collection<String> myCollection = java.util.Collections.emptyList();
}
