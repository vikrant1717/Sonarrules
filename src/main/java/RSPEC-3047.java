import java.util.*;

public class Example {
    public void doSomethingToAList(List<String> strings) {
        for (String str : strings) {
            doStep1(str);
        }
        for (String str : strings) {  // Noncompliant
            doStep2(str);
        }
    }
    
    public void processNumbers(int[] numbers) {
        for (int num : numbers) {
            validateNumber(num);
        }
        for (int num : numbers) { // Noncompliant
            processNumber(num);
        }
    }
    
    void doStep1(String str) {}
    void doStep2(String str) {}
    void validateNumber(int num) {}
    void processNumber(int num) {}
}
