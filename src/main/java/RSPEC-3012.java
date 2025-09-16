import java.util.*;

public class Example {
    public void copyArray(String[] source) {
        String[] array = new String[source.length];
        for (int i = 0; i < source.length; i++) {
            array[i] = source[i]; // Noncompliant
        }
    }

    public void copyList(List<String> source) {
        List<String> list = new ArrayList<>();
        for (String s : source) {
            list.add(s); // Noncompliant
        }
    }
    
    public void copyArray2(int[] src, int[] dest) {
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i]; // Noncompliant
        }
    }
}
